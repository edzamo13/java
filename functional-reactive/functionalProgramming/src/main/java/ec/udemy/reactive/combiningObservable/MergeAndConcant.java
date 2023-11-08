package ec.udemy.reactive.combiningObservable;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class MergeAndConcant {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> source1 = Observable.just("Edwin", "Paula", "Pedro");
        Observable<String> source2 = Observable.just("Jose", "Manuel", "Maria");

        Observable<String> source3 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "Source 3: " + e);
        Observable<String> source4 = Observable.interval(1, TimeUnit.SECONDS).map(e -> "Source 4: " + e);

        extracted(source1, source2);
        System.out.println("***********");
        extracted1(source3, source4);
        System.out.println("***********");
        extracted2(source3, source4);
        Thread.sleep(10000);

    }

    private static void extracted2(Observable<String> source3, Observable<String> source4) {
        Observable
                .concat(source3, source4)
                .subscribe(s -> System.out.println(" subscribe  concat:" + s));
    }

    private static void extracted1(Observable<String> source3, Observable<String> source4) {
        Observable.
                merge(source3, source4)
                .subscribe(s -> System.out.println(" subscribe  merge:" + s));
    }

    private static void extracted(Observable<String> source1, Observable<String> source2) {
        Observable
                .merge(source1, source2)
                .subscribe(System.out::println);
    }


}
