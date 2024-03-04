package ejercicio005;

import java.util.ArrayList;

public class Ejercicio005 {
    public static void main (String [] args){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Pokemon a actualizar y nuevo pokemon
        String pokemonAActualizar = "Charizard";
        String nuevoPokemon = "Dragonite";

        // Actualizar el elemento en el ArrayList
        if (nombresPokemon.contains(pokemonAActualizar)) {
            int indice = nombresPokemon.indexOf(pokemonAActualizar);
            nombresPokemon.set(indice, nuevoPokemon);
            System.out.println("Lista despues de la actualizacion:");
            for (String nombre : nombresPokemon) {
                System.out.println("La lista ahora es: "+nombre);
            }
        } else {
        System.out.println("El Pokémon a actualizar no se encuentra en la lista.");
        }
    }
}
