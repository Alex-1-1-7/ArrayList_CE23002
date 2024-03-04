package Ejercicio006;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio006 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // Eliminar el tercer elemento del ArrayList
        int indiceAEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del pokemon que desea eliminar: "));

        boolean si= false;
        while(!si){
            if (indiceAEliminar >= 0 && indiceAEliminar < nombresPokemon.size()) {
                si = true;
                nombresPokemon.remove(indiceAEliminar);
                System.out.println("Lista después de eliminar el tercer elemento:");
                for (String nombre : nombresPokemon) {
                    System.out.println("\"" + nombre + "\"");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El índice a eliminar está fuera del rango del ArrayList.");
                indiceAEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice del pokemon que desea eliminar: "));
            }
        }
    }
}
