package rappi;

public class InnovaCrysta extends Car{

    public InnovaCrysta(int carMileage) {
        super(false, "6", carMileage);
    }

    @Override
    String getMileage() {
        return this.getMileage_()+ " kmpl";
    }

    @Override
    public void printCar(String wagonR) {
        String sedan = getIsSedan()? "is" : "is not";
        System.out.println("A "+wagonR+" "+sedan+" Sedan, is "+getSeats()+"-seater, and has a mileage of around 22 kmpl.");
    }


}
