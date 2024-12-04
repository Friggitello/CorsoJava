import java.util.Arrays;

public class ProvaArray {
    public static void main(String[] args) {

        //Creazione di array lungo 5 vuoti
        int[] arrayInteri = new int[5];
        System.out.println(Arrays.toString(arrayInteri));

        //Creazione di array di stringhe lungo 5 valori null
        String[] parole = new String[5];
        System.out.println(Arrays.toString(parole));

        //Cambiare il valore nella posizione 1 dell'array
        parole[1] = "Ciao";
        System.out.println(Arrays.toString(parole));
    }
}
