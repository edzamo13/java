package ec.udemy.reactive.observerPattern;


public interface SubjectLibrary {

    void subscribeObserver(Observer ob);
    void unSubscribeObserver(Observer ob);
    void notifyObserver();


}
