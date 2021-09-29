package ec.com.openwebinar.gangOfFour.creationalPatter.builder.example;

public class Director {
	
	public void contruct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}

}
