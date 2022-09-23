package tipoDatosGenericos;

import model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class ExampleTypeDateGenericPairExtends <K,V extends User>{

    private K key;
    private V value;

    /**
     * The most commonly used type parameter names are:
     *
     * E - Element (used extensively by the Java Collections Framework)
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V etc. - 2nd, 3rd, 4th types
     * */
    public static void main(String[] args) {
        ExampleTypeDateGenericPairExtends pairExtends= new ExampleTypeDateGenericPairExtends();



    }

}
