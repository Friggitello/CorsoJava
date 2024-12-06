import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Tombola {
    /*
    Scrivete una funzione che prende in input una cartella
    della tombola sotto forma di matrice 3*5 e un array di
    numeri estratti (almeno 20 numeri, non ripetuti)
    La funzione controllerà quanti ambi, terni, quaterne e
    cinquine sono presenti nella scheda e restituirà la stringa
    «il giocatore ha totalizzato ambi: numero ambi etc..
    In caso di tombola invece, la funzione restituirà
    direttamente la stringa «TOMBOLA!!»
     */
    public static void tombola(int[][] cartella,int[] estrazione){
        //creazione cartella matrice 3*5

    }
    int [][] cartella = {{7,23,41,63,89},{12,24,44,65,78},{5,16,32,56,90}};

    public static int[] sceltaEstrazione(){
        int [] estrazione = new int[20];
        double z = 0;
        /*
        for (int i = 0; i < 20; i++){
            while (x < 90 && estrazione[i] == x){
                x = Math.random()*100;
                estrazione[i] = (int) x;

            }
            */
                /*
                if (estrazione[i] == x){
                    do {
                        x = Math.random()*100;
                        estrazione[i] = (int) x;
                    }while (x > 90 && estrazione[i] == x);
                }
                */
        for (int i= 0; i < 20; i++){
            z = Math.random()*100;
            while (z < 1 || z > 90){
                z = Math.random()*100;
            }
            int x = (int) z;
            for (int j=0; j < 20; j++){
                if (x == estrazione[j]){
                    z = Math.random()*100;
                    while (z < 1 || z > 90){
                        z = Math.random()*100;
                    }
                    x = (int) z;
                    j--;
                }
            }
            estrazione[i] = x;
        }
        return estrazione;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sceltaEstrazione()));
    }
}
