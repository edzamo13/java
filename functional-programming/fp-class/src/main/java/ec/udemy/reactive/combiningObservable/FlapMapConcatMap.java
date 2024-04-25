package ec.udemy.reactive.combiningObservable;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class FlapMapConcatMap {
    public static void main(String[] args) {

        List<String> list= List.of("Edwin","Patricio","Zamora");
    //    flapMapExtracted(list);
        concatMepExtracted(list);
    }

    private static void flapMapExtracted(List<String> list) {
        Observable
                .fromIterable(list)
                .flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }

    private static void concatMepExtracted(List<String> list) {
        Observable
                .fromIterable(list)
                .concatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }
}
