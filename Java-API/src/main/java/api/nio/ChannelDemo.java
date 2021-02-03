package api.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @Author: caopeng
 * @Description:
 * @Date: Created in 10:35 2020/12/22
 */
public class ChannelDemo {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:","TestFolder","test.txt");
        nioChannel(path);
    }

    /**
     * @Description:
     * @param path
     * @Return: void
     * @Author: caopeng
     * @Date: 2020/12/22 10:43
     */
    public static void nioChannel(Path path) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(String.valueOf(path));
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(4);
        while (buffer.remaining() > 1) {
            channel.read(buffer);
        }
        byte[] array = buffer.array();
        for (byte b : array) {
            System.out.println((char) b);
        }


    }
}
