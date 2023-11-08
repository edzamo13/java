package oracle.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Pet {

    private  String name;
    private double weight;

    public void breath(){

    }

    public void eat(){

    }

}
