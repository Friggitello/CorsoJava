import java.sql.Array;
import java.util.Arrays;

public class Tabelline {
    /*
Scrivete una funzione che dato in input due numeri n ed m,
crea un array lungo m che in ogni cella ha il valore di indice della cella moltiplicato per n.
 */
    public static int[] tabelline(int n, int m){
        int[] array = new int[m];
        for (int i=0; i < array.length; i++){
            array[i] = i * n;
        }

        return array;
    }

    public static void main(String[] args) {
        String risultato = Arrays.toString(tabelline(10,20));
        System.out.println(risultato);
    }
}
