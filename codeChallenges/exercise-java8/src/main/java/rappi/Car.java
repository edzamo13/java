package rappi;

public abstract class  Car {

    private Boolean isSedan;
    private String seats;
    private Integer mileage;



    public Car(Boolean isSedan, String seats, Integer mileage) {
        this.isSedan = isSedan;
        this.seats = seats;
        this.mileage = mileage;
    }

    public Car() {

    }

    public Boolean getIsSedan() {
        return isSedan;
    }


    public String getSeats() {
        return seats;
    }

    public Integer getMileage_(){
        return mileage;
    }

    abstract String getMileage();

    public abstract void printCar(String wagonR);



}
