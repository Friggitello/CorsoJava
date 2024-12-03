public class Operatori {
    public static void main(String[] args) {
        System.out.println("Prova operatori\n");
        System.out.println(false || true);
        System.out.println(false && true);

        int x = 5;

        //Se l'incremento è dopo il valore, primas stampa il valore poi lo incrementa
        System.out.println(x++);
        System.out.println(x);

        //Se invece è scritto prima, la variabile viene incrementata prima di essere stampata
        System.out.println(++x);
        System.out.println(x);
    }
}
