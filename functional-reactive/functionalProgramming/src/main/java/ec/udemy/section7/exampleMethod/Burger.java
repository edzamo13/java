package ec.udemy.section7.exampleMethod;

public class Burger {

    private String burgerType;

    public Burger() {
        this.burgerType="";
    }

    public Burger(String burgerType) {
        this.burgerType = burgerType;
    }
    public Burger addVegies(){
        System.out.println("Adding vegies to the burger");
        return new Burger(this.burgerType+= "Vegie");
    }

    public Burger addCheese(){
        System.out.println("Add cheese to the burger");
        return new Burger(this.burgerType+="Cheese");
    }

    @Override
    public String toString() {
        return "Burger{" +
                "burgerType='" + burgerType + '\'' +
                '}';
    }
}
