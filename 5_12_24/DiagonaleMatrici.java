import java.security.KeyStore;

public class DiagonaleMatrici {
    /*
    Scrivere una funzione che data una matrice quadrata in input, restituisce la somma della diagonale da sinistra a destra
    Scrivere una seconda funzione che presa una matrice quadrata e un booleano a seconda del valore del booleano
    restituisce o la somma della diagonale da sinistra a destra o quella da destra a sinistra
     Hint: usare la prima funzione nella seconda
     */
    public static int sommaDiagonali(int[][]matrice){
        //Iniz del risultato
        int risultato = 0;
        //Ciclo per visualizzare i valori della matrice
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[i].length; j++){
                //Se il valore della riga è uguale a quello della colonna, sommarlo al risultato
                if ( j == i){
                    risultato += matrice[i][j];
                }
            }
        }

        return risultato;
    }

    public static int sommaDiagonaliInput(int[][]matrice, boolean scelta){
        //Iniz risultato
        int risultato = 0;
        //Se vero rifare l'altra funzione
        if (scelta){
            return sommaDiagonali(matrice);
        } else {
            //Se no per ogni riga prendere il valore di .length -1
            //per trovare il punto da destra a sinistra
            for(int i = 0; i < matrice.length; i++){
                for(int j = 0; j < matrice[i].length; j++){
                    if ( j+i == matrice.length-1){
                        risultato += matrice[i][j];
                    }
                }
            }

            return risultato;
        }
    }
    //Correzioni Marco semplificate
    public static int sommaMarco(int[][] matrice){
        int risultato = 0;
        //Ha bisogno di un solo indice perchè nella diagonale è lo stesso es. 0-0 1-1 2-2
        for (int i = 0; i < matrice.length; i++){
            risultato += matrice[i][i];
        }
        return risultato;
    }

    public static int sommaMarcoDX(int[][] matrice, boolean scelta){
        int risultato = 0;
        //Anche qui si puo usare solo un indice perchè 0-3 1-2 2-1 3-0 si puo prendere
        //l'indice i e come secondo il length-1 e -i
        for (int i = 0; i < matrice.length; i++){
            risultato += matrice[i][matrice.length-1-i];
        }
        return risultato;
    }


    public static void main(String[] args) {
        int [][] matrice = {{0,2,4},{4,5,6},{7,8,9}};
        System.out.println(sommaDiagonali(matrice));
        System.out.println(sommaDiagonaliInput(matrice,false));
        System.out.println(sommaMarco(matrice));
        System.out.println(sommaMarcoDX(matrice,true));
    }
}
