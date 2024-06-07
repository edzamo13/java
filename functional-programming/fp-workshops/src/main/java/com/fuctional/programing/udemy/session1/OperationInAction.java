package com.reactive.programming.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class OperationInAction {
    public static void main(String[] args) {
        Observable<Employ> employObservable = Observable.just(
                new Employ(1, "Edwin", 1000, 4.0),
                new Employ(1, "Pedro", 1000, 5.0),
                new Employ(1, "Miguel", 1000, 3.0),
                new Employ(1, "Jose", 1000, 6.0),
                new Employ(1, "Paula", 1000, 8.0),
                new Employ(1, "Andres", 1000, 5.0)
        );

        employObservable
                .filter(employ -> employ.getRating() > 4.0)
                .sorted((o1, o2) -> Double.compare(o2.getRating(), o1.getRating()))
                .map(employ -> employ.getName())
                .take(4)
                .toList()
                .subscribe(System.out::println);
        System.out.println("***********");
        List<Integer> integers = List.of(10, 20, 30, 34, 70, 80, 33, 55, 34);
        Observable
                .fromIterable(integers)
                .scan((integer, integer2) -> integer + integer2)
                .subscribe(System.out::println);
        System.out.println("***********");
        Observable
                .fromIterable(integers)
                .reduce((integer, integer2) -> integer + integer2)
                .subscribe(System.out::println);
    }
}
