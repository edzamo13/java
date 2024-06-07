package com.reactive.programming.udemy.reactive.combiningObservable;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ZipAndCombineLastest {

    public static void main(String[] args) throws InterruptedException {
        Observable<Long> source1 = Observable.interval(200, TimeUnit.MILLISECONDS);
        Observable<Long> source2 = Observable.interval(1, TimeUnit.SECONDS);

        Observable.zip(source1, source2, (s, s2) -> "source 1:" + s + " source 2:" + s2)
                .subscribe(System.out::println);

        Observable.combineLatest(source1, source2, (s, s2) -> "source 1:" + s + " source 2:" + s2)
                .subscribe(System.out::println);


        Thread.sleep(20000);
    }
}
