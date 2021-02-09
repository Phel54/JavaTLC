package Objects_Classes;

public class Trader {
    private String name;
    private Account account;

    public void addTrade(Trade trade, double singleTrades ){
        singleTrades= trade.getPrice() *trade.getQuantity();
        account.setTotalTrades(singleTrades);

    }
}
