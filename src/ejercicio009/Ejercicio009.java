package ejercicio009;

import java.util.ArrayList;

public class Ejercicio009 {
    public static void main(String[] args) {
        // Primer ArrayList
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");
        for (String original: nombresPokemon){
            System.out.println("La lista es: "+original);
        }

        // Segundo ArrayList para copiar
        ArrayList<String> copiaNombresPokemon = new ArrayList<>(nombresPokemon);
        System.out.println(" ");
        for (String copiados: copiaNombresPokemon){
            System.out.println("La lista copiada es: "+copiados);
        }
    }
}
