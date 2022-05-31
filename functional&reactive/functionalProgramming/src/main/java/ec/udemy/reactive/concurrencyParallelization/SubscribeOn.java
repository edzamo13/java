package ec.udemy.reactive.concurrencyParallelization;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SubscribeOn {

    public static void main(String[] args) throws InterruptedException {

        Observable
                .just("Pasta ", "Pizza", "Rabioles", "Curry", "Chow mein", "other value", "Other product..")
                .unsubscribeOn(Schedulers.computation())
                .map(s -> s.toUpperCase())
                .subscribeOn(Schedulers.newThread())
                .filter(s -> s.startsWith("P"))
                .subscribe(s -> print(s));
        Thread.sleep(6000);
    }

    private static void print(String s) {
        System.out.println(s + ": Printed by :" + Thread.currentThread().getName());
    }
}
