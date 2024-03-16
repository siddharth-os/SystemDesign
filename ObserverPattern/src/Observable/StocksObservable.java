package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void setStockCount(int stockCount);
    public int getStockCount();

    public void notifyObservers();
}
