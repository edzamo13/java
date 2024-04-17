package ec.workshop.java8.basic.interfaces;

public class ComparadorRectangulos {

	public static void main(String[] args) {

		RectanglePlus rectangleOne = new RectanglePlus(10, 20);
		Relatable rectangleTwo = new RectanglePlus(20, 10);
		
		rectangleOne.print();
		interfaces.MyInterface rectangle2 = (interfaces.MyInterface) rectangleTwo;
		rectangle2.print();
		
		switch (rectangleOne.isLargerThan(rectangleTwo)) {
		case -1:
			System.out.println("Es menor");
			break;
		case 0:
			System.out.println("Son iguales");
			break;
		case 1:
			System.out.println("Es mayor");
			break;
		}

	}

}
