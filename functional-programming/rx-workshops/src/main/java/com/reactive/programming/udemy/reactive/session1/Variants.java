package com.reactive.programming.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class Variants {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alex", "Paula", "Jack");
        Observable<String> source1 = Observable.empty();
        source
                .first("xxx")
                .subscribe(System.out::println);
        Single.just("Elvin")
                .subscribe(System.out::println);
        source
                .firstElement()
                .subscribe(System.out::println);
        source1
                .firstElement()
                .subscribe(s -> System.out.println("value: " + s),
                        throwable -> throwable.printStackTrace(),
                        () -> System.out.println("completed"));

        Completable completable= Completable.complete();
        System.out.println("------");
        completable.subscribe(() -> System.out.println("Completed!.. "));
        Completable
                .fromRunnable(() -> System.out.println("Some process executing"))
                .subscribe(() -> System.out.println("The process executed successfully"));

    }
}
