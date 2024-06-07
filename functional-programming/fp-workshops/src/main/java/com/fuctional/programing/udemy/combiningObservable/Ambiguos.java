package com.reactive.programming.udemy.reactive.combiningObservable;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Ambiguos {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> observable1= Observable.interval(1, TimeUnit.SECONDS)
                .map(e-> "Observable 1: "+ e);
        Observable<String> observable2= Observable.interval(10, TimeUnit.SECONDS)
                .map(e-> "Observable 2: "+ e);

        Observable.amb(Arrays.asList(observable1,observable2))
                .subscribe(System.out::println);

        Thread.sleep(10000);
    }
}
