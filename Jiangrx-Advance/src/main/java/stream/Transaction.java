package stream;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: caopeng
 * @Date: 2020/8/11
 */
public class Transaction{

    private String traderName;
    private String year;
    private int amount;

    public Transaction(String traderName,String year,int amount){
        this.traderName=traderName;
        this.year=year;
        this.amount=amount;
    }

    public String getTraderName() {
        return traderName;
    }

    public void setTraderName(String traderName) {
        this.traderName = traderName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "traderName='" + traderName + '\'' +
                ", year='" + year + '\'' +
                ", amount=" + amount +
                '}';
    }
}