package ejercicio012;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio012 {
    public static void main(String[] args) {
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        // indices de inicio y fin
        int indiceInicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice desde el cual quiere imprimir"));
        int indiceFin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el indice hasta el cual quiere imprimir"));

        // extraer la porción del ArrayList
        List<String> porcionExtraida = nombresPokemon.subList(indiceInicio, indiceFin + 1);

        // imprimir la porción extraida
        System.out.println("Porción extraída:");
        for (String nombre : porcionExtraida) {
            System.out.println(nombre);
        }
    }
}
/*nombresPokemon.subList(indiceInicio, indiceFin + 1): Este método subList pertenece a la interfaz
List y se utiliza para obtener una vista de una porción de la lista original. Toma dos argumentos:
el índice de inicio (inclusive) y el índice de fin (exclusivo). En este caso, indiceInicio es el
índice desde el cual comenzará la porción y indiceFin + 1 es el índice hasta el cual se extraerán
los elementos. Se suma 1 al índice de fin porque el segundo parámetro de subList es exclusivo,
lo que significa que el elemento en el índice de fin no está incluido en la porción.

List<String> porcionExtraida =: Declara una nueva variable llamada porcionExtraida que es de tipo
List<String>. Esto significa que la porción extraída se almacenará en una nueva lista que contendrá
elementos de tipo String.

En resumen, la línea de código List<String> porcionExtraida =
nombresPokemon.subList(indiceInicio, indiceFin + 1); crea una nueva lista
(porcionExtraida) que contiene una porción del ArrayList original (nombresPokemon).
La nueva lista incluirá elementos desde el índice de inicio hasta el índice de fin (inclusive)
del ArrayList original.*/