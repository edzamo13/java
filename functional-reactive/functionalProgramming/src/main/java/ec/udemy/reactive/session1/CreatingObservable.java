package ec.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

import java.util.ArrayList;
import java.util.List;

public class CreatingObservable {

    public static void main(String[] args) {
        Observable<Integer> source= new ObservableCreate<>(
                e-> {
                    e.onNext(1);
                    e.onNext(2);
                    e.onNext(3);
                    e.onComplete();
                }
        );

        source.subscribe(System.out::println);
        //just
        Observable<Integer> observable= Observable.just(1,2,3,4);
        observable.subscribe(System.out::println);
        //from Iterable
        List<String> lists= List.of("valor1","valor 2");
        Observable<String> stringObservable = Observable.fromIterable(lists);
        stringObservable.subscribe(System.out::println);
        System.out.println("*****************");
        //defer
        List<String> listStrig= new ArrayList<>();
        listStrig.add("Pedro");
        listStrig.add("Martha");
        Observable<String> sourceDefer = Observable.defer(
                ()-> Observable.fromIterable(listStrig)
        );
        sourceDefer.subscribe(System.out::println);
        listStrig.add("Paula");
        sourceDefer.subscribe(System.out::println);


    }
}
