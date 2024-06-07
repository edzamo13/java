package com.reactive.programming.udemy.reactive.fundamentals;

public interface CallBack {
    void pushData(String data);
    void pushComplete();
    void pushError(Exception ex);
}
