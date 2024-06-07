package com.reactive.programming.udemy.reactive.combiningObservable;

import com.reactive.programming.udemy.reactive.session1.Employ;
import io.reactivex.rxjava3.core.Observable;

public class Grouping {
    public static void main(String[] args) {
        Observable<Employ> employObservable = Observable.just(
                new Employ(1, "Edwin", 1000, 8.0),
                new Employ(2, "Pedro", 1000, 5.0),
                new Employ(3, "Miguel", 1000, 3.0),
                new Employ(4, "Jose", 1000, 6.0),
                new Employ(5, "Paula", 1000, 8.0),
                new Employ(6, "Andres", 1000, 5.0)
        );

        extracted(employObservable);

        extracted1(employObservable);


    }

    private static void extracted1(Observable<Employ> employObservable) {
        employObservable.groupBy(employ -> employ.getRating())
                .flatMapSingle(e -> e.toList())
                .subscribe(System.out::println);
    }

    private static void extracted(Observable<Employ> employObservable) {
        employObservable
                .groupBy(employ -> employ.getRating())
                .flatMapSingle(em -> em.toMultimap(k-> k.getCod(), v-> v.getName()))
                .subscribe(System.out::println);
    }
}
