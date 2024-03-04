package ejercicio021;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio021 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Nuevo Pokemon para reemplazar
        String nuevoPokemon = "Venusaur";
        int indice = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en que indice quiere reemplazar el pokemon"));

        // Reemplazar el segundo elemento del ArrayList
        reemplazarElemento(nombresPokemon, indice, nuevoPokemon);

        // Imprimir la lista después de reemplazar
        System.out.println("Lista después de reemplazar el segundo elemento:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }

    // Metodo para reemplazar un elemento en un ArrayList
    public static <T> void reemplazarElemento(ArrayList<T> lista, int indice, T nuevoElemento) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, nuevoElemento);
        }
    }
}
