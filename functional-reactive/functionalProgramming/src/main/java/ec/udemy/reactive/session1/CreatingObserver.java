package ec.udemy.reactive.session1;

import io.reactivex.rxjava3.core.Observable;

public class CreatingObserver {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("Orange","Black"," Blue");
        //subscribe(@NonNull Consumer<? super T> onNext, @NonNull Consumer<? super Throwable> onError,
        source.subscribe(n-> System.out.println("next: " +n),throwable -> throwable.printStackTrace(),() -> System.out.println("Completed ") );
        System.out.println("**********");
        source.subscribe(s -> System.out.println("next: " + s ) , Throwable::printStackTrace);
        System.out.println("**********");
        source.subscribe(s -> System.out.println("next : " + s));
    }
}
