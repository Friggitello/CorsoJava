import java.util.Arrays;

public class Fibonacci {
    /*
Scrivere un metodo che stampa l’ennesimo elemento della sequenza di Fibonacci,
nella quale ogni numero è definito dalla somma dei due precedenti,
eccetto i primi due che sono per definizione 0 e 1.
Esempio: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... E così via. Assumete di iniziare da 0,
dunque fibonacci(0) = 0, fibonacci(1) = 1, ... e così via.

suggerimento: usate gli array

Test: fibonacci(45) deve stampare 1134903170

 */
    public static int fibonacci(int input){
        //Creazione dell'array lungo N numeri (+1 perchè l'array parte da 0)
        if (input < 0){
            System.out.println("Il numero non puo essere negativo, tentativo col numero positivo:\n");
            input = Math.abs(input);
        }


        int[] array = new int[input+1];
        //Assegnazione dei primi 2 valori per definizione
        array[0] = 0;
        array[1] = 1;
        //Ciclo che sfoglia tutti i valori dell'array e ne imposta il valore come la somma dei 2 precedenti
        for (int i = 0; i < input+1; i++){
            //Esclusione dei primi 2 numeri
            if (i < 2){
                continue;
            }else {
                //Somma
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        //Ritorno dell'ultimo valore dell'array
        return array[input];
    }

    public static void main(String[] args) {
        int risultato = fibonacci(45);
        System.out.println(risultato);
    }
}
