public class Trader {
    protected String name;
    protected  Account account;


    public void addTrade(Trade trade, double singleTrades ){
        singleTrades= trade.getPrice() *trade.getQuantity();
        account.setTotalTrades(singleTrades);

    }
}
