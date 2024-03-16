package Observer;

import Observable.StocksObservable;

public class MobileObserver implements NotificationAlertObserver{
    private StocksObservable stocksObservable;
    private String name;

    public MobileObserver(StocksObservable stocksObservable,String name) {
        this.stocksObservable = stocksObservable;
        this.name = name;
    }
    @Override
    public void update() {
        sendMessage(name+" Hurray!"+stocksObservable.getClass()+" is in stock.");
    }
    public void sendMessage(String message){
        System.out.println(message);
    }
}
