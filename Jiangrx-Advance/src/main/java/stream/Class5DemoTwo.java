package stream;

import java.awt.geom.Area;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: caopeng
 * @Date: 2020/8/11
 */
public class Class5DemoTwo {

    public static void main(String[] args) {
        Trader trader1 = new Trader("Raoul", "Cambridge");
        Trader trader2 = new Trader("Mario", "Milan");
        Trader trader3 = new Trader("Alan", "Cambridge");
        Trader trader4 = new Trader("Brian", "Cambridge");
        List<Transaction> transactionList = Arrays.asList(
                new Transaction("brian", "2011", 300),
                new Transaction("raoul", "2012", 1000),
                new Transaction("raoul", "2011", 400),
                new Transaction("mario", "2012", 710),
                new Transaction("mario", "2012", 700),
                new Transaction("alan", "2012", 950)
        );

        //找出所有2011年的交易，并按照交易金额排序（由低到高）
              //交易员都在哪些不同的城市工作
            //查找所有来自剑桥的交易员，按照姓名排序
        System.out.println("-------查找所有来自剑桥的交易员，按照姓名排序-------");
         //返回所有交易的姓名字符串，按照字母排序
        System.out.println("-------返回所有交易的姓名字符串-------");
        //有没有交易员在米兰工作的

        //打印生活在剑桥的交易员的所有交易额

        //所有交易中，最高的交易额是多少
        //找到交易额最小的交易
    }


}
