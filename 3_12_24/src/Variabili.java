import java.nio.channels.CancelledKeyException;

public class Variabili {
    public static void main(String[] args) {
        System.out.println();
        int x = 5;
        boolean b = true;
        char a = 'b';
        System.out.println("la variabile x vale " + x);
        System.out.println("la variabile b vale " + b);
        System.out.println("la variabile a vale " + a);

        Persona persona1 = new Persona();

        persona1.nome = "franco";
        persona1.cognome = "pippi";

        System.out.println(persona1);
        System.out.println(persona1.nome + "\n" + persona1.cognome);

        Persona persona2 = new Persona();
        persona2.nome = "franco";
        persona2.cognome = "pippi";

        // anche avendo lo stesso nome le due persone sono diverse
        System.out.println(persona1 == persona2);

        int y = 4;
        System.out.println(x == y); // un solo = indica assegnamento
                                    // due = indicano un confronto
        System.out.println(persona1.equals(persona2));

        //le variabili senza valore danno null
        String s = null;
        System.out.println(s);

        //anche se la divisione è decimale, l'output da solo la parte intera
        int z = x/y;
        System.out.println(z);

        //anche se viene definita double e non int da lo stesso output perchè effettua
        //prima la divisione e poi viene castato
        double m = x/y;
        System.out.println(m);

        //si castano le variabili mettendo il nuovo tipo dentro le parentesi
        //prima della variabile
        double n = (double) x/(double) y;
        System.out.println(n);

        Calcolatrice.calcolatrice();

    }
}
