import java.sql.Array;
import java.util.Arrays;

public class Tabelline {
    /*
Scrivete una funzione che dato in input due numeri n ed m,
crea un array lungo m che in ogni cella ha il valore di indice della cella moltiplicato per n.
 */
    public static int[] tabelline(int n, int m){
        //Creazione dell'array di M valori
        int[] array = new int[m];
        //Ciclo dei valori dell'array
        for (int i=0; i < array.length; i++){
            //Moltiplicazione dell'indice dell'array i con N
            array[i] = i * n;
        }
        //Ritorno di tutto l'array
        return array;
    }

    public static void main(String[] args) {
        String risultato = Arrays.toString(tabelline(5,10));
        System.out.println(risultato);
    }
}
