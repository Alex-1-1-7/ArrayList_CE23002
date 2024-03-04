package ejercicio010;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio010 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // mezclar los elementos
        Collections.shuffle(nombresPokemon);


        System.out.println("Lista despues de mezclar:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}
