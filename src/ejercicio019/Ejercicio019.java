package ejercicio019;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio019 {
    public static void main(String[] args) {
        // ArrayList original
        ArrayList<String> nombresPokemonOriginal = new ArrayList<>();
        nombresPokemonOriginal.add("Pikachu");
        nombresPokemonOriginal.add("Charizard");
        nombresPokemonOriginal.add("Bulbasaur");
        nombresPokemonOriginal.add("Squirtle");
        nombresPokemonOriginal.add("Jigglypuff");

        // nueva capacidad deseada
        int nuevaCapacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva capacidad de la lista"));

        // nuevo ArrayList con la capacidad deseada
        ArrayList<String> nombresPokemonReducido = new ArrayList<>(nombresPokemonOriginal.subList(0, nuevaCapacidad));

        //la lista despues de reducir la capacidad
        System.out.println("Lista después de reducir la capacidad:");
        for (String nombre : nombresPokemonReducido) {
            System.out.println(nombre);
        }
    }
}
