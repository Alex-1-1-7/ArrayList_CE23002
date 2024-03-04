package Ejercicio007;

import javax.swing.*;
import java.util.ArrayList;

public class Ejercicio007 {
    public static void main (String [] args){
        ArrayList<String> nombresPokemon = new ArrayList<>();
        nombresPokemon.add("Pikachu");
        nombresPokemon.add("Charizard");
        nombresPokemon.add("Bulbasaur");
        nombresPokemon.add("Squirtle");
        nombresPokemon.add("Jigglypuff");

        String nombreIndice = JOptionPane.showInputDialog("Ingrese el nombre del pokemon para saber si indice");

        int indiceEncontrado = nombresPokemon.indexOf(nombreIndice);
        //si indiceEncntrado es diferente de menos uno es porque la condicion es verdadera
        // ya que indexOf al no encontrar nada en la lista devuelve -1
        // lo que quiere decir que si indiceEncontrado es igual a -1 es porque no se encontro el
        // elemento buscado

        if (indiceEncontrado != -1) {
            System.out.println("El elemento \"" +nombreIndice+ "\" se encuentra en la posición " + indiceEncontrado);
        } else {
            System.out.println("El elemento \"" + nombreIndice + "\" no se encuentra en la lista.");
        }
    }
}
/*indexOf Método:

El método indexOf se utiliza para buscar la posición del primer occurrencia del elemento especificado en el ArrayList.
Si el elemento se encuentra en el ArrayList, indexOf devuelve el índice (posición) de la primera ocurrencia del elemento.
Si el elemento no se encuentra en el ArrayList, indexOf devuelve -1.
Condición if (indiceEncontrado != -1):

La expresión indiceEncontrado != -1 evalúa si el valor de la variable indiceEncontrado no es igual a -1.
Si el elemento fue encontrado en el ArrayList (es decir, indexOf devolvió un índice diferente de -1), entonces la condición será verdadera (true).
En ese caso, el bloque de código dentro del if se ejecutará.
Significado práctico:

Si indiceEncontrado es diferente de -1, significa que el elemento buscado se encontró en el ArrayList y indexOf devolvió la posición de esa ocurrencia.
Entonces, dentro del bloque if, se imprime un mensaje indicando que el elemento se encuentra en la posición especificada.
En resumen, esta construcción if (indiceEncontrado != -1) se utiliza para manejar el caso en el que el elemento buscado se encuentra en el ArrayList
y para realizar acciones específicas en consecuencia. En caso contrario, si indexOf devuelve -1, significa que el elemento no está presente en el ArrayList,
y se ejecutarían otras acciones o se proporcionaría un mensaje indicando que el elemento no se encuentra en la lista.*/
