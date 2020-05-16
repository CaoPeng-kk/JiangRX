package exceptions;

/**
 * @Author: caop
 * @Description:
 * @Date: Created in 23:26 2020/5/15
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * Java的异常就是在运行时期发生的不正常的情况，Java中用类的形式对异常进行描述和封装对象，
         * 就是通过面向对象的思想，对不正常的情况封装成了对象，用异常类进行描述
         * 将正常流程代码与错误处理代码分离，保证了程序的健壮性
         */
        int x = 1;
        int y = 0;

        try {
            int sum = x/y;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            try {
                throw new DemoException("自定义异常");
            } catch (DemoException demoException) {
                System.out.println(demoException.getMessage());
            }
        } finally {
            System.out.println("总会执行");
        }

    }
}

/**
 * 自定义异常类
 */
class DemoException extends Exception{

    public DemoException() {
    }

    public DemoException(String message) {
        super(message);
    }

}