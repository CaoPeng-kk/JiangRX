package files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 16:41 2020/5/22
 */
public class FileDemo {

    /**
     * "写两个示例程序：
     * 1. 遍列当前目录下所有文件，包括子目录；
     * 2.文件的读取和写入，文本文件逐行读取逐行写入，数据量要超过10万行数据"
     */
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:", "SpringBoot");
        Path path1 = Paths.get("D:", "Demo","one.txt");
        walkFile(path);
        System.out.println(path1);
        readAndWrite(path1);
    }

    /**
     * 访问目录及文件方法
     * @param path
     * @throws IOException
     */
    public static void walkFile(Path path) throws IOException {
        Files.walkFileTree(path, new FileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println(dir);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return FileVisitResult.SKIP_SUBTREE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                return FileVisitResult.CONTINUE;
            }
        });
    }

    /**
     * 读写方法
     * @param path
     * @throws IOException
     */
    public static void readAndWrite(Path path) throws IOException {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream("D:/Demo/two.txt"),StandardCharsets.UTF_8),true);
        FileInputStream in = new FileInputStream(String.valueOf(path));
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(in,StandardCharsets.UTF_8))){
            String line = null;
            while ((line = reader.readLine()) != null){
                printWriter.println(line);
            }
        }
    }
}
