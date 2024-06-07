package com.reactive.programming.udemy.reactive.session1;

public class Employ {
    private Integer cod;
    private  String name;
    private  Integer amount;
    private Double rating;

    public Employ() {
    }

    public Employ(Integer cod, String name, Integer amount, Double rating) {
        this.cod = cod;
        this.name = name;
        this.amount = amount;
        this.rating = rating;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", rating=" + rating +
                '}';
    }
}
