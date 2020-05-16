package conllections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        /**
         * HashSet存储元素的时候会调用该对象的hashCode()方法来得到hashCode值，根据这个值来决定该元素在
         * 集合中的位置
         * HashSet认为只有equals相等并且hashCode值相等，两个对象才相等，所以在存储自定义对象时应该遵守
         * 一个规则，当两个对象equals相等时，他们的hashCode值也应该相等。
         */
        HashSet h = new HashSet();
        h.add(new Person("james",16));
        h.add(new Person("nike",18));
        h.add(new Person("tim",26));
        h.add(new Person("cook",36));
        Iterator it = h.iterator();
        while (it.hasNext()) {
            Person p = (Person)it.next();
            System.out.println(p.getName());
        }
        System.out.println();

        /**
         * TreeSet是SortSet接口的实现类，Sort代表了TreeSet集合能够保证元素处于排序状态，有两种排序规则
         * 分别是自然排序和定制排序，自然排序要实现Comparable接口，重写CompareTo方法，定制排序要传入一个
         * Comparator接口的实现类并重写compare方法来定义排序规则，因为是函数式接口，可用lambda表达式
         */
        TreeSet<Person> set = new TreeSet<>();
        set.add(new Person("cp",22));
        set.add(new Person("cp",22));
        set.add(new Person("cp",14));
        for (Person p : set) {
            //已经排序了
            System.out.println(p.toString());
        }
    }
}

class Person implements Comparable<Person>{
    private String name ;
    private int age ;
    /*  自然排序的时候*/
    @Override
    public int compareTo(Person o) {
        int temp = this.age-o.age;
        return temp==0?this.name.compareTo(o.name):temp;
    }
    @Override
    public int hashCode() {
        System.out.println("hashset");
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
