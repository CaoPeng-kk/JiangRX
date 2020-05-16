package conllections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {
        /**
         * PriorityQueue是比较标准的队列实现，它并不是严格按照先进先出的队列定义来对元素进行组织，而是按照元素
         * 本身的大小重新排序了
         */
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        //向队尾添加元素
        queue.offer(6);
        queue.offer(-2);
        queue.offer(5);
        queue.offer(8);
        queue.offer(1);
        System.out.println(queue);
        System.out.println();

        /**
         * Deque是Queue接口的子接口，它代表一个基于数组实现的一个双端队列，它允许从队列的两端来对数据进行操作
         * 它同时提供了pop push等方法 因此可以当作栈来使用，同时也是可以当队列来使用
         */
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("caop");
        deque.push("jiangrongxin");
        deque.offer("shanghai");
        System.out.println(deque);
        System.out.println(deque.peek());


    }
}
