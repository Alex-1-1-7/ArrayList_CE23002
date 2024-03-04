package ejercicio011;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio011 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // invertir los elementos
        Collections.reverse(nombresPokemon);


        System.out.println("Lista despues de invertir los elementos:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }
}
