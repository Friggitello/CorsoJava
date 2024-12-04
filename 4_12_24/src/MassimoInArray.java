public class MassimoInArray {
    /*
    Scrivere una funzione che calcoli il massimo valore compreso in un array,
    senza utilizzare metodi di supporto.
     */
    public static int massimo(int[] array){
        //Dichiarazione del valore locale
        int variabile = array[0];
        //Scorro tutti i valori dell'array
        for (int i = 0; i < array.length; i++){
            //Se il valore locale è minore del prossimo valore nell'array
            //Allora viene copiato in nel valore locale
            if (variabile < array[i]) {
                variabile = array[i];
            }
        }
        //Alla fine di tutto verrà ritornato il valore piu grande dell'array
        return variabile;
    }

    public static void main(String[] args) {
        int[] input = {1,3,6,12,10,432,53};

        int risultato = massimo(input);
        System.out.println(risultato);

    }
}
