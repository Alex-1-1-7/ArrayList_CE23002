package ejercicio003;
import java.util.ArrayList;
public class Ejercicio003 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Nuevo Pokemon
        String nuevoPokemon = "Pikachu";

        // Insertar el nuevo Pokémon en la primera posicion
        nombresPokemon.add(0, nuevoPokemon);


        System.out.println("Lista después de la inserción:");
        for (String nombre : nombresPokemon) {
            System.out.println("La nueva lista es: "+ nombre);
        }
    }

}
