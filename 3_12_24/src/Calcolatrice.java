import javax.swing.*;
import java.io.InputStream;
import java.util.Scanner;

public class Calcolatrice {
        /*Scrivere un metodo che chieda all'utente di inserire due numeri e di inserire un'operazione tra le seguenti:
        - somma
        - sottrazione
        - moltiplicazione
        - divisione
        - resto
        e stampa a video il risultato dell'operazione scelta tra i due numeri
        */
    public static void calcolatrice(){
        System.out.println("Inserire due numeri:\n");
        //Input dei due numeri utilizzati
        Scanner input = new Scanner(System.in);
        int primoNumero = Integer.parseInt(input.next());
        int secondoNumero = Integer.parseInt(input.next());
        //input dell'operazione da fare
        System.out.println("Scegliere l'operazione tra\nSomma +\nSottrazione -\nMoltiplicazione *\nDivisione /\nResto %\n");

        String sceltaOperatore = input.next();
        //
        if (sceltaOperatore.equals("+")){
            int somma = primoNumero + secondoNumero;
            System.out.println(primoNumero + " + " + secondoNumero + " = " + somma);
        } else if (sceltaOperatore.equals("-")) {
            int sottrazione = primoNumero - secondoNumero;
            System.out.println(primoNumero + " - " + secondoNumero + " = " + sottrazione);
        } else  if (sceltaOperatore.equals("*")){
            int moltiplicazione = primoNumero * secondoNumero;
            System.out.println(primoNumero + " * " + secondoNumero + " = " + moltiplicazione);
        } else if (sceltaOperatore.equals("/")) {
            double divisione = (double) primoNumero / (double) secondoNumero;
            System.out.println(primoNumero + " / " + secondoNumero + " = " + divisione);
        } else if (sceltaOperatore.equals("%")){
            int resto = primoNumero % secondoNumero;
            System.out.println("Il resto tra " + primoNumero + " e " + secondoNumero + " è " + resto);
        } else {
            System.out.println("Riprova");
            calcolatrice();
        }
    }

    public static void main(String[] args) {
        calcolatrice();
    }
}