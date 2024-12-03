public class Fattoriale2 {
    public static int fattoriale2 (int x){
        //Se numero = 0 || 1 da errore
        if (x < 0){
            System.out.println("Errore, non puoi usare un numero negativo, Riprova\n");
            return -1;
        } else if (x <= 1) {
            System.out.println("1");
            return -1;
        } else {
            //Dichiarazione di variabile risultato
            int risultato = 1;
            //Ciclo for che ripete la moltiplicazione n volte
            for (int i=1; i<=x; i++){
                risultato = risultato * i;
            }
            System.out.println(risultato);
        }
        return x;
    }

    public static void main(String[] args) {
        fattoriale2(10);
    }
}
