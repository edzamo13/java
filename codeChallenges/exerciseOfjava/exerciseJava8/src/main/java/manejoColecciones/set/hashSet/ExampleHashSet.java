package manejoColecciones.set.hashSet;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Se trata de un Collection<E> que no permite duplicados.
 * ● Abstracción del concepto matemático de conjunto.
 * ● No añade ningún método a los heredados de Collection<E>.
 * ● No hay acceso “posicional” (i.e. tercer elemento).
 * ● Mejora la implementación de los métodos equals y hashCode con
 * respecto a Collection<E>
 * ○ Dos instancias de Set<E> son iguales si contienen los
 * mismos elementos.
 * <p>
 * <p>
 * Aunque todavía no lo hemos trabajado, una de las colecciones que más usarás a
 * lo largo de tu vida como programador es ArrayList<E>. HashSet se le parece
 * en bastantes funcionalidades, y ofrece mejor rendimiento. Por tanto:
 * - Si no queremos manejar repetidos
 * - No importa el orden (de valor o inserción)
 * Podemos usar HashSet como implementación.
 * Un ejemplo lo podemos encontrar al usar JPA/Hibernate en el manejo de
 * asociaciones @OneToMany (uno-a-muchos).
 */
public class ExampleHashSet {

    public static void main(String[] args) {
        hashSetBasic();
        collectionDuplicate();

    }

    private static void hashSetBasic() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Cadena 1");
        stringSet.add("Cadena 2");
        stringSet.add("Cadena 3");
        stringSet.add("Cadena 4");
        stringSet.add("Cadena 1");

        System.out.println("La cadena repetida no simplemente no se le tomca en cuenta");
        stringSet.forEach(System.out::println);

    }

    /**
     * Eliminacion de duplicados en otra coleccion
     * Crear un hashSet a partir de una coleccion
     * Eliminando los cuplicados que contenga
     */
    private static void collectionDuplicate() {
        // EJEMPLO DE APLICACIÓN: eliminación de duplicados en otra colección
        // Crea un HashSet a partir de otra colección
        // eliminando los duplicados que contenga
        Collection<String> palabrasDelQuijote = palabrasQuijote();
        Set<String> quijoteHashSet = new HashSet<>(palabrasDelQuijote);

        // Se puede comprobar si contiene algún elemento
        if (quijoteHashSet.contains("hidalgo"))
            System.out.println("Contiene la palabra hidalgo");
        else
            System.out.println("No contiene la palabra hidalgo");

        // Comparación de número de elementos
        System.out.println("Total de palabras en el 1º párrafo: " + palabrasDelQuijote.size());
        System.out.println("Palabras diferentes en el 1º párrafo: " + quijoteHashSet.size());

        // Imprimir todos los elementos del hashset
        quijoteHashSet.forEach(System.out::println);

    }

    private static Collection<String> palabrasQuijote() {
        String quijote = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, lantejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las fiestas, con sus pantuflos de lo mesmo, y los días de entresemana se honraba con su vellorí de lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años; era de complexión recia, seco de carnes, enjuto de rostro, gran madrugador y amigo de la caza. Quieren decir que tenía el sobrenombre de Quijada, o Quesada, que en esto hay alguna diferencia en los autores que deste caso escriben; aunque por conjeturas verosímiles se deja entender que se llamaba Quijana. Pero esto importa poco a nuestro cuento: basta que en la narración dél no se salga un punto de la verdad.";
        quijote = quijote.toLowerCase().replace(".", "").replace(",", "");
        quijote = quijote.toLowerCase().replace(".", "").replace(",", "");
        return Arrays.asList(quijote.split(" "));


    }


}
