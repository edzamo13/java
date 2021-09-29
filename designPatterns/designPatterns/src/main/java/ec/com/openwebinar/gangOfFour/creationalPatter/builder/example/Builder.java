package ec.com.openwebinar.gangOfFour.creationalPatter.builder.example;

public interface Builder {

	abstract void buildPartA();

	abstract void buildPartB();

	abstract Product getResult();

}
