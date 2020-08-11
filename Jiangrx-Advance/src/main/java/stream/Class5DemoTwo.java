package stream;

import com.sun.deploy.util.StringUtils;

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
        System.out.println("-----找出所有2011年的交易，并按照交易金额排序（由低到高）----");
        List<Transaction> sorted = transactionList.stream()
                .filter(transaction -> transaction.getYear().equals("2011"))
                .sorted(Comparator.comparingInt(Transaction::getAmount))
                .collect(Collectors.toList());  //将stream转为list
        sorted.forEach(System.out::println);


        //交易员都在哪些不同的城市工作
        System.out.println("------交易员都在哪些不同的城市工作------------------------");
        List<Trader> traders = Arrays.asList(trader1, trader2, trader3, trader4);
        traders.stream().forEach(System.out::println);


        //查找所有来自剑桥的交易员，按照姓名排序
        System.out.println("------查找所有来自剑桥的交易员，按照姓名排序---------------");
        List<Trader> tradersList = traders.stream().filter(trader -> trader.getArea().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        tradersList.forEach(System.out::println);


        //返回所有交易的姓名字符串，按照字母排序
        System.out.println("-------返回所有交易的姓名字符串-------");
        List<String> transactionnames = transactionList.stream().sorted(Comparator.comparing(Transaction::getTraderName))
                .map(Transaction::getTraderName)
                .collect(Collectors.toList());
        transactionnames.forEach(System.out::println);


        //有没有交易员在米兰工作的
        System.out.println("-------有没有交易员在米兰工作的-------");
        List<Trader> milan = traders.stream().filter(trader -> trader.getArea().equals("Milan"))
                .collect(Collectors.toList());
        milan.forEach(System.out::println);


//       打印生活在剑桥的交易员的所有交易额
        System.out.println("-------打印生活在剑桥的交易员的所有交易额-------");
        Map<String, Trader> collect = traders.stream()
                .filter(item -> "Cambridge".equals(item.getArea())).collect(Collectors.toMap(trader ->
                {
                    char[] cs = trader.getName().toCharArray();
                    cs[0] += 32;
                    return String.valueOf(cs);
                }, trader -> trader));
        List<Integer> integers = transactionList.stream().filter(item -> collect.containsKey(item.getTraderName()))
                .map(transaction -> transaction.getAmount()).collect(Collectors.toList());
        integers.forEach(System.out::println);


        //所有交易中，最高的交易额是多少
        System.out.println("-------有交易中，最高的交易额是多少-------");
        Optional<Integer> max = transactionList.stream().map(transaction -> transaction.getAmount())
                .max(Integer::compareTo);
        max.ifPresent(integer -> System.out.println(integer));


        //找到交易额最小的交易
        System.out.println("-------找到交易额最小的交易-------");
        Optional<Integer> min = transactionList.stream().map(transaction -> transaction.getAmount())
                .min(Integer::compareTo);
        min.ifPresent(integer -> System.out.println(integer));
    }


}
