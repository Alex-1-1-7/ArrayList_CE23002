package ejercicio018;

import java.util.ArrayList;

public class Ejercicio018 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // comprobar si el ArrayList esta vacio
        if (nombresPokemon.isEmpty()) {
            System.out.println("El ArrayList está vacío.");
        } else {
            System.out.println("El ArrayList no está vacío.");
        }
    }
}
