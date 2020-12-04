package api.io.file;

import sun.reflect.generics.scope.DummyScope;

import java.io.File;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 10:13 2020/11/26
 */
public class FileDemo {

    public static void main(String[] args) {
        File file = new File("D:\\Chrome");
        // 返回一个数组 包含此目录下所有文件的抽象路径名
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        String path = "D:/Chrome/Clash-Windows";
        System.out.println(path.replaceAll("/Chrome",""));

    }

}
