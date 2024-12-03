public class provaWrapper {
    public static void main(String[] args) {

        //ogni tipo primitivo ha una controparte wrapper
        int numeroIntero = 5;
        Integer nuovoNumero = Integer.valueOf(numeroIntero);
        System.out.println(nuovoNumero);
    }
}
