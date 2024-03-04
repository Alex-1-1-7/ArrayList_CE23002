package ejercicio002;
import java.util.ArrayList;
public class ejercicio002 {
    private static ArrayList<String> pokemon = new ArrayList<>();
    public static ArrayList<Integer> enteros = new ArrayList<>();
    public static ArrayList<Character> letras = new ArrayList<>();
    public static void agregarPokemon(String nombre) {
        pokemon.add(nombre);
    }

    public static void imprimirPokemon() {
        for (String nombre : pokemon) {
            System.out.println("Los pokemones son: " + nombre);
        }
    }

    public static void agregarEntero(int num){
        enteros.add(num);
    }
    public static void imprimirNum(){
        for (int numeros : enteros){
            System.out.println("Los numeros son: "+numeros);
        }
    }
    public static void agregarLetras(char letra){
        letras.add(letra);
    }
    public static void imprimirLetra(){
        for (Character letra : letras){
            System.out.println("Las letras son: "+letra);
        }
    }


    public static void main (String [] args){
        pokemon.add ("Pikachu");
        pokemon.add ("Charizard");
        pokemon.add ("Bulbasaur");
        pokemon.add ("Squirtle");
        pokemon.add ("Jigglypuff");
        pokemon.add ("Eevee");
        pokemon.add ("Mewtwo");
        pokemon.add ("Gyarados");
        pokemon.add ("Snorlax");
        pokemon.add ("Vulpix");

        imprimirPokemon();

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);
        enteros.add(6);
        enteros.add(7);
        enteros.add(8);
        enteros.add(9);
        enteros.add(10);

        imprimirNum();

        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        letras.add('F');
        letras.add('G');
        letras.add('H');
        letras.add('I');
        letras.add('J');

        imprimirLetra();

    }
}
