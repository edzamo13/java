package ec.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;

public class Operators {
    public static void main(String[] args) {

        Observable.just(1,2,3,4,5,90,89,60)
                .filter(f-> f>5)
               .sorted()
                .subscribe(System.out::println);

    }
}
