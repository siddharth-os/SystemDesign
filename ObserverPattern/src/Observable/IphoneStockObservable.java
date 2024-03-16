package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StocksObservable{
    private List<NotificationAlertObserver> list = new ArrayList<>();
    private int stockCount = 0;
    @Override
    public void add(NotificationAlertObserver observer) {
        list.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        list.remove(observer);
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount==0){
            notifyObservers();
        }
        this.stockCount = stockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver obj:list){
            obj.update();
        }
    }
}
