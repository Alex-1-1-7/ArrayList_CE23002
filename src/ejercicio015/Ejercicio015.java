package ejercicio015;

import java.util.ArrayList;

public class Ejercicio015 {
    public static void main(String[] args) {
        // Primer conjunto
        ArrayList<String> primerConjunto = new ArrayList<>();
        primerConjunto.add("Pikachu");
        primerConjunto.add("Charizard");
        primerConjunto.add("Bulbasaur");

        // Segundo conjunto
        ArrayList<String> segundoConjunto = new ArrayList<>();
        segundoConjunto.add("Squirtle");
        segundoConjunto.add("Jigglypuff");

        // Unir los conjuntos
        ArrayList<String> listaResultante = new ArrayList<>(primerConjunto);
        listaResultante.addAll(segundoConjunto);

        System.out.println("Lista resultante después de la unión:");
        for (String nombre : listaResultante) {
            System.out.println(nombre);
        }
    }
}
