package ejercicio017;

import java.util.ArrayList;

public class Ejercicio017 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Vaciar el ArrayList
        nombresPokemon.clear();

        System.out.println("ArrayList después de vaciar:");
        if (nombresPokemon.isEmpty()) {
            System.out.println("El ArrayList esta vacio.");
        } else {
            for (String nombre : nombresPokemon) {
                System.out.println(nombre);
            }
        }
    }
}
