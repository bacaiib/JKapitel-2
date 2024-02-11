package unterkapitel_02_05;

public class Potenzieren {

    public static void main(String[] args) {
        
        long basis = 3;
        long exponent = 4;
        long ergebnis = 1;
        long zaehler = exponent;

        while (zaehler > 0){
            ergebnis *= basis; 
            zaehler--;
        }

        System.out.println(ergebnis);
    } 

}

