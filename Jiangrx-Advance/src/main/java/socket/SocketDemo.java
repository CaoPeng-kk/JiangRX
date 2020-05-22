package socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 16:41 2020/5/22
 */
public class SocketDemo {

    /**
     * 写一个示例不用写笔记，只用Java里的网络编程，网页链接将内容输出到本地文本中
     *
     */
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.baidu.com/");
        URLConnection connection = url.openConnection();
        connection.connect();
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        for (Map.Entry<String,List<String>> entry: headerFields.entrySet()) {
            String key = entry.getKey();
            for (String value : entry.getValue()) {
                System.out.println(key+":"+value);
            }
        }

        try (Scanner scanner = new Scanner(connection.getInputStream(), String.valueOf(StandardCharsets.UTF_8))) {
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream("D:/Demo/three.txt"),StandardCharsets.UTF_8),true);
            for (int n = 1; scanner.hasNextLine() && n <= 10; n++) {
                printWriter.println(scanner.nextLine());
            }

        }
    }
}
