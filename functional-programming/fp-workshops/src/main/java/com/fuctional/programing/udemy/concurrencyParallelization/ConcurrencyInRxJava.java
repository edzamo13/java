package com.fuctional.programing.udemy.concurrencyParallelization;

import io.reactivex.rxjava3.core.Observable;

public class ConcurrencyInRxJava {

    public static void main(String[] args) {
     //   Observable<String> observable = getStringObservable();
        Observable<String> observable = getStringObservableWithOutThread();

        observable
                .subscribe(s -> System.out.println("Observer 1: " + s + "Thread is : " + Thread.currentThread().getName()));
        observable
                .subscribe(s -> System.out.println("Observer 2: " + s + "Thread is : " + Thread.currentThread().getName()));
    }

    private static Observable<String> getStringObservable() {
        Observable<String> observable = Observable.create(
                emitter -> {
                    new Thread(() -> {
                        emitter.onNext("Hello");
                        emitter.onNext("RxJava");
                    })
                            .start();
                }
        );
        return observable;
    }

    private static Observable<String> getStringObservableWithOutThread() {
        Observable<String> observable = Observable.create(
                emitter -> {

                    emitter.onNext("Hello");
                    emitter.onNext("RxJava");
                }
        );
        return observable;
    }
}
