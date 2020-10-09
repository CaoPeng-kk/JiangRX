package conllections;

import java.util.*;

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
        /**
         * 演示去重的方法
         */
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(2);
        System.out.println("去重前"+list1);
        System.out.print("去重后");
        removeDuplicate(list1);
        System.out.println();
        /**
         * 演示打乱集合中顺序
         */
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(i);
        }
        System.out.println("打乱前"+list2);
        System.out.print("打乱后");
        shuffle(list2);
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
        /**
         * 去重方法
         */
    public static void removeDuplicate(ArrayList<Integer> list1) {
        HashSet<Integer> hash = new HashSet<>();
        for(int x = 0; x < list1.size(); x++) {
            hash.add(list1.get(x));
        }
        System.out.println(hash);
    }

    /**
     * 演示打乱ArrayList中的顺序
     * @param list
     */
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }
}