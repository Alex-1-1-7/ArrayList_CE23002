package ejercicio016;

import java.util.ArrayList;

public class Ejercicio016 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemonOriginal = new ArrayList<>();
        nombresPokemonOriginal.add("Pikachu");
        nombresPokemonOriginal.add("Charizard");
        nombresPokemonOriginal.add("Bulbasaur");
        nombresPokemonOriginal.add("Squirtle");
        nombresPokemonOriginal.add("Jigglypuff");

        // Clonar
        ArrayList<String> nombresPokemonClon = new ArrayList<>(nombresPokemonOriginal);

        // original
        System.out.println("ArrayList original:");
        for (String nombre : nombresPokemonOriginal) {
            System.out.println(nombre);
        }


        System.out.println("\nArrayList clonado:");
        for (String nombre : nombresPokemonClon) {
            System.out.println(nombre);
        }
    }
}
