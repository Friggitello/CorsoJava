import java.util.Arrays;

public class Anagrammi {
    /*
    Due stringhe a e b sono dette anagrammi se contengono gli stessi caratteri con le
    stesse frequenze. Ad esempio gli anagrammi di CAT sono CAT,ACT,TAC,TCA,ATC e CTA.
    Date due stringhe a e b in input, stampare "anagrammi" se lo sono e "non anagrammi"
    se non lo sono
     */
    public static String anagrammi(String a, String b){
        //Se le due parole non hanno stessa lunghezza esce dal programma
        if (a.length() != b.length())
            return "Errore, le parole hanno lunghezze diverse";
        //Si fanno diventare minuscole tutte e due le parole
        a = a.toUpperCase();
        b = b.toUpperCase();
        //Si formano due array di caratteri con le due parole
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        //Si fa un sort dei due array
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        //Controllo se i due array sono uguali tra di loro
        if ( Arrays.equals(arrayA,arrayB)){
            return "anagrammi";
        }else
            return "non anagrammi";
    }

    public static void main(String[] args) {
        System.out.println(anagrammi("CAt","AcT"));
    }
}
