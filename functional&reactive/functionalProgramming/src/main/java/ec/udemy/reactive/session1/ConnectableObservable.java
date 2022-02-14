package ec.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ConnectableObservable {
    public static void main(String[] args) throws InterruptedException {
        io.reactivex.rxjava3.observables.ConnectableObservable<Long> source = Observable.interval(1, TimeUnit.SECONDS).publish();
        source.connect();
        source.subscribe(s -> System.out.println("......" + s));
        Thread.sleep(10000);
        source.subscribe(s -> System.out.println("******" + s));
        Thread.sleep(10000);

    }
}
