package ejercicio001;
import java.util.ArrayList;

public class Ejercicio001 {
    private static ArrayList<String> listaPokemon = new ArrayList<>();

    public static void agregarPokemon(String nombre) {
        listaPokemon.add(nombre);
    }

    public static void imprimir() {
        for (String nombre : listaPokemon) {
            System.out.println("Los pokemones son: " + nombre);
        }
    }
    public static void main (String [] agrs){
        agregarPokemon("Pikachu");
        agregarPokemon("Charizard");
        agregarPokemon("Bulbasaur");
        agregarPokemon("Squirtle");
        agregarPokemon("Jigglypuff");

        imprimir();
    }
}
