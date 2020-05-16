package conllections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
        /**
         * HashMap是Map接口的典型实现类，是存储键值对的集合，key不能重复，最多允许一个键值对的key为null
         * 用做key的对象必须实现hashCode()方法和equals()方法
         * HashMap对key的要求跟HashSet完全相同-当关于比较两个对象是否一致的情况时
         */
        Map<Integer,String> Map = new HashMap<>() ;
        method(Map);
        Set<Map.Entry<Integer,String>> entrySet = Map.entrySet();
        Iterator<Map.Entry<Integer,String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer,String> me = it.next();
            Integer a = me.getKey();
            String b = me.getValue();
            System.out.println(a+","+b);
        }

    }
    public static void method(Map<Integer,String> map) {
        //相同的key会覆盖掉原来的值
        String s1 = map.put(8,"nike");
        String s2 = map.put(8,"tom");
//		System.out.println(s1+","+s2);
    }

    /**
     * TreeMap的排序规则跟TreeSet大致相同
     */
}

