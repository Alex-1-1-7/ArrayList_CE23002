package ejercicio014;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio014 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // intercambiar
        int indice1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice que quiere cambiar"));
        int indice2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice por el cual quiere cambiar"));

        // intercambiar los elementos en el ArrayList
        intercambiarElementos(nombresPokemon, indice1, indice2);

        // imprimir la lista después del intercambio
        System.out.println("Lista después del intercambio:");
        for (String nombre : nombresPokemon) {
            System.out.println(nombre);
        }
    }

    // metodo para intercambiar dos elementos en un ArrayList
    public static <T> void intercambiarElementos(ArrayList<T> lista, int indice1, int indice2) {
        Collections.swap(lista, indice1, indice2);
    }

}
