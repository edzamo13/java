package com.reactive.programming.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Disposing {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);

        interval.subscribe(e -> System.out.println("Observer 1:" + e));
        interval.subscribe(e -> System.out.println("Observer 2:" + e));

        Thread.sleep(10000);

    }
}
