import java.util.Arrays;

public class DispariPerDue {
    //Scrivere una funzione che dato un array di valori ne restituisce una copia
    //dove i numeri dispari sono stati moltiplicati per 2.
    public static int[] dispariPerDue(int[] arrayIniziale){
        //Inizializzazione dell'array finale creandolo lungo quanto quello iniziale
        int[] arrayFinale = new int[arrayIniziale.length];
        //Scorro tutti i valori dell'arary
        for (int i = 0; i < arrayIniziale.length; i++){
            //Per ogni elemento controllo se sia dispari
            if (arrayIniziale[i] % 2 != 0){
                //Se dispari viene moltiplicato per 2
                arrayFinale[i] = 2 * arrayIniziale[i];
            }
            else{
                //Se no copio il valore iniziale
                arrayFinale[i] = arrayIniziale[i];
            }
        }
        //Ritorno del risultato finale
        return arrayFinale;
    }

    public static void main(String[] args) {
        int[] input = {1,4,6,9,14,63,734,1235,6234};
        int[] risultato = dispariPerDue(input);
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(risultato));
    }
}
