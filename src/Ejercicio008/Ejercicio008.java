package Ejercicio008;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio008 {
    public static void main(String[] args) {
        // Crear un ArrayList de nombres de Pokémon
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // ordenar el arrayList alfabeticamente
        // como el ingeniero
        Collections.sort(nombresPokemon);

        // Imprimir la lista después de ordenar
        System.out.println("Lista después de ordenar alfabéticamente:");
        for (String nombre : nombresPokemon) {
            System.out.println("La lista ordenada haora es: "+nombre);
        }
    }
}
