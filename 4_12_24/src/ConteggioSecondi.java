public class ConteggioSecondi {
    /*
Scrivete una funzione che dato in input un numero di secondi, restituisce una stringa
che dice «Giorni: numero di giorni, Ore: numero di ore etc…»
 */
    public static void conteggioSecondi(int secondi){
        int minuti = secondi / 60;
        int ore = minuti / 60;
        int giorni = ore / 24;
        int mesi = giorni / 30;
        int anni = mesi / 12;
        System.out.println(secondi + " secondi sono:\n" + anni + " Anni\n" + mesi + " Mesi\n" + giorni + " Giorni\n" + ore + " Ore\n" + minuti + " Minuti\n" + secondi + " Secondi");
    }

    public static void main(String[] args) {
        conteggioSecondi(412312212);
    }
}
