1.集合类
       为了保存数量不确定的数据，以及保存具有映射关系的数据，Java提供了集合类，集合类主要负责保存，盛装其他数据，
    因此集合也称作容器类。
       Java集合类主要由两个接口派生而出Collection 、Map，在Collection体系中，Set和List是Collection接口派生出
    的两个子接口，分别代表无序跟有序集合，Queue接口是Java提供的队列实现。在Map体系中，所有的Map实现类用于保存具
    有映射关系的数据。
       对于Set List Queue Map四种集合，最常用的实现类分别是HashSet, TreeSet, ArrayList, LinkedList, 
       ArrayDeque, HashMap, TreeMap等实现类。
    
2.异常处理
       Java的异常机制主要依赖于五个关键字，try catch finally throw throws ,Java的异常体系的顶层父类是Throwble
    下面又两大分支，Error和Exception，Error属于很严重的错误，是由虚拟机进行处理的，我们无需定义try catch 或声明
    Exception分为两大类 Runtime异常跟Checked异常 Exception中除了RuntimeException及其子类外都属于Checked异常
    需要显示声明处理，如果不声明或处理，就无法通过编译。
    

3.Maven
        是 Apache 下的一个纯 Java 开发的开源项目。基于项目对象模型（缩写：POM）概念，
     Maven利用一个中央信息片断能管理一个项目的构建、报告和文档等步骤。Maven 是一个项目管理工具，
     /*可以对 Java 项目进行构建、依赖管理。*/
    