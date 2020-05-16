package conllections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListDemo {

    public static void main(String[] args) {
        /**
         *实现了list接口，底层封装了一个动态的，可再分配的Object[]数组，是线程不安全的，可用Collections工具
         * 类中的方法使其线程安全。
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("jiangrongxin");
        list.add("江融信");
        System.out.println(list);
        list.add(1,"新数据");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(1);
        System.out.println(list);
        System.out.println();

        /**
         *  是list接口的实现类，意味着它是一个list集合，可以根据索引来访问集合内的元素，同时它也实现了Deque
         *  接口-是Queue的子接口，所以可以被当作双端队列和栈来使用， 底层维护了一个双向链表的数据结构。
         */
        LinkedList<String> linkedList = new LinkedList<>();
        //加入双端队列的开头
        linkedList.addFirst("jiangrongxin");
        //加入队列的尾部
        linkedList.offer("江融信");
        //加入到集合
        linkedList.add("caop");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}