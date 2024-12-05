public class ConteggioSecondi {
    /*
Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa
che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
 */
    /*
    public static void conteggioSecondi(int secondi){
        //Dichiarazione e assegnazione dei valori richiesti es. 1 min = 60 sec
        int minuti = secondi / 60;
        int ore = minuti / 60;
        int giorni = ore / 24;
        int mesi = giorni / 30;
        int anni = mesi / 12;
        //Stampa a schermo dei valori equivalenti
        System.out.println(secondi + " secondi sono:\n" + anni + " Anni\n" + mesi + " Mesi\n" + giorni + " Giorni\n" + ore + " Ore\n" + minuti + " Minuti\n" + secondi + " Secondi");
    }
    */

    //Correzione Marco
    public static String conteggioMarco(int secondi){
        if (secondi < 0){
            return "Il numero di secondi non puo essere negativo";
        }
        //Calcola prima il numero dei giorni in modo che rimanga il resto per calcolare i minuti
        //e i secondi rimanenti
        int giorni = secondi / 86400;
        int resto_giorni = secondi % 86400;
        int ore = resto_giorni / 3600;
        int resto_ore = resto_giorni % 3600;
        int minuti = resto_ore / 60;
        int resto_minuti = resto_ore % 60;
        int resto_secondi = resto_minuti;

        return secondi + " Secondi sono\n" + "Giorni: " + giorni +
                "\nOre: " + ore + "\nMinuti: " + minuti +
                "\nSecondi: " + resto_secondi;
    }

    public static void main(String[] args) {
        System.out.println(conteggioMarco(70000));
    }

}
