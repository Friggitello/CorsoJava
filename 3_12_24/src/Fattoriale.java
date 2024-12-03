import java.util.Scanner;

public class Fattoriale {
    public static void fattoriale(){
        System.out.println("Inserire un numero per calcolarne il fattoriale:\n");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        //Se numero = 0 || 1 da errore
        if (numero < 0){
            System.out.println("Errore, non puoi usare un numero negativo, Riprova\n");
            fattoriale();
        } else if (numero <= 1) {
            System.out.println("1");
        } else {
            //Dichiarazione di variabile risultato
            int risultato = 1;
            //Ciclo for che ripete la moltiplicazione n volte
            for (int i=1; i<=numero; i++){
                risultato = risultato * i;
            }
            System.out.println(risultato);
        }
    }

    public static void main(String[] args) {
        fattoriale();
    }
}
