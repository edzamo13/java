package ec.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;

public class HelloRxJava {
    public static void main(String[] args) {
        Observable<String> observable =  Observable.create(
                e -> {
                    e.onNext("Hello");
                    e.onNext("RxJava");
                }
        );

        observable.subscribe(s-> System.out.println("Observer 1:"+ s));
        observable.subscribe(s-> System.out.println("Observer 2:"+ s));

    }
}
