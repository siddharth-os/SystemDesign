import Observable.IphoneStockObservable;
import Observable.StocksObservable;
import Observer.MobileObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneStockObservable();
        NotificationAlertObserver o1= new MobileObserver(stocksObservable,"Ramesh");
        NotificationAlertObserver o2= new MobileObserver(stocksObservable,"Rakesh");
        NotificationAlertObserver o3= new MobileObserver(stocksObservable,"Kamlesh");
        NotificationAlertObserver o4= new MobileObserver(stocksObservable,"Naresh");

        stocksObservable.add(o1);
        stocksObservable.add(o2);
        stocksObservable.add(o3);

        stocksObservable.setStockCount(10);
        stocksObservable.setStockCount(0);
        stocksObservable.add(o4);
        stocksObservable.setStockCount(100);
    }
}