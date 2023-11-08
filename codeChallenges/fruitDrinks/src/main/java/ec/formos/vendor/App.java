package ec.formos.vendor;


import ec.formos.vendor.model.Person;
import ec.formos.vendor.service.beans.Order;
import ec.formos.vendor.service.Visitor.JuicePreparationVisitor;
import ec.formos.vendor.service.Visitor.JuicePreparationVisitorImpl;
import ec.formos.vendor.service.Validation;
import ec.formos.vendor.util.LoadParameter;
import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class App {

    @Getter
    @Setter
    private static Person vendor;
    @Getter
    @Setter
    private static LoadParameter loadParameter;
    @Getter
    @Setter
    private static Scanner sn;
    @Getter
    @Setter
    private static Scanner f;
    @Getter
    @Setter
    private static Scanner m;


    static final int MEASURE = 300;
    private final static Logger LOGGER = Logger.getLogger("bitacora.fruitDrinks");
    public static void main(String[] args) {
        sn = new Scanner(System.in);
        f = new Scanner(System.in);
        m = new Scanner(System.in);

        boolean salir = false;
        int opcion, fruit1;
        loadParameter = new LoadParameter();

        while (!salir) {
            System.out.println("\n ");
            System.out.println("*************************************************");
            System.out.println("               Fruit Drink Inventory              ");
            System.out.println("Bienvenido:" + (getLoadParameter().getPerson()));
            System.out.println("*************************************************");
            System.out.println("Choose one option:");
            System.out.println("1. Inventory");
            System.out.println("2. Preparation of fruit juice");
            System.out.println("3. Sellout ");
            System.out.println("4. Exit!..");



            try {

                System.out.println("Write one of the options:");
                opcion = getSn().nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Inventory");
                        System.out.println("****************");
                        System.out.println("Current Inventory of ingredients: \n" + getLoadParameter().getListLoadInventories());
                        System.out.println("****************");
                        break;
                    case 2:
                        System.out.println("Fruit juice");
                        System.out.println("Choose the one fruit: [1,2,3]:");
                        System.out.println(getLoadParameter().getListLoadInventories()
                                .stream()
                                .filter(type -> type.getType().equals("f"))
                                .map(f -> f.getId() + " " + f.getName())
                                .collect(Collectors.toList())
                        );
                        fruit1 = getF().nextInt();
                        System.out.println("Only 1 size of drink, 300ml ");
                        getLoadParameter().setListLoadInventories(Validation.calculePreparation(getLoadParameter().getListLoadInventories(), fruit1, MEASURE));
                        System.out.println("Inventory" + getLoadParameter().getListLoadInventories());
                        break;

                    case 3:
                        System.out.println("sellout");
                        Order order = new Order();
                        order.setInventories(getLoadParameter().getListLoadInventories());
                        JuicePreparationVisitor visitor = new JuicePreparationVisitorImpl();
                        order.acceptSellout(visitor);
                        break;
                    case 4:
                        System.out.println("bye!..");
                        LOGGER.log(Level.INFO,"Bye");
                        salir = true;
                        break;
                    default:
                        LOGGER.log(Level.WARNING,"Only numbers  1 - 4");
                }
            } catch (InputMismatchException e) {
                LOGGER.log(Level.WARNING,"Only numbers !!.");
                sn.next();
            }
        }
    }



}
