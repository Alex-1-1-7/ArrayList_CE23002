package ejercicio020;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio020 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemonOriginal = new ArrayList<>();
        nombresPokemonOriginal.add("Pikachu");
        nombresPokemonOriginal.add("Charizard");
        nombresPokemonOriginal.add("Bulbasaur");

        // Nuevo tamaño deseado
        int nuevoTamanoDeseado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo tamao de la lista"));

        // Aumentar el tamaño del ArrayList
        aumentarTamanioArrayList(nombresPokemonOriginal, nuevoTamanoDeseado);

        // Imprimir la lista después de aumentar el tamaño
        System.out.println("Lista después de aumentar el tamaño:");
        for (String nombre : nombresPokemonOriginal) {
            System.out.println(nombre);
        }
    }

    // Método para aumentar el tamaño del ArrayList
    public static <T> void aumentarTamanioArrayList(ArrayList<T> lista, int nuevoTamano) {
        while (lista.size() < nuevoTamano) {
            lista.add(null);
        }
    }
}
