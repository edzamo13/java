package polimorfismo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString
public class Rectangulo {

    private float base;
    private  float altura;


    public float getArea() {
        System.out.println("Area de un rectángulo");
        return base*altura;
    }

    public float getPerimetro() {
        System.out.println("Perímetro de un rectángulo");
        return (base*2) + (altura*2);
    }
}
