package ejercicio022;

import java.util.ArrayList;

public class Ejercicio022 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");
        nombresPokemon.add("Eevee");
        nombresPokemon.add("Mewtwo");
        nombresPokemon.add("Gyarados");
        nombresPokemon.add("Snorlax");
        nombresPokemon.add("Vulpix");

        System.out.println("Imprimir todos los elementos utilizando sus posiciones:");
        for (int i = 0; i < nombresPokemon.size(); i++) {
            System.out.println("Posición " + i + ": " + nombresPokemon.get(i) );
        }
    }
}
