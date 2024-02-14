package unterkapitel_02_05;

public class MeinePotenzierierung {

    public static void main(String[] args) {
        
        int basis = 2;
        int exponent = 6;
        int zaehler = exponent;
        int ergebnis = 1;

        while (zaehler > 0){
            ergebnis *= basis;
            zaehler--;
        }
        System.out.println("Die Potenzierung von "+basis+" mit "+exponent+" ergibt "+ergebnis);
    }

}
