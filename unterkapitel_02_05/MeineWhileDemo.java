package unterkapitel_02_05;

public class MeineWhileDemo {

    public static void main(String[] args) {
        
        int zaehler = 10;

        while ( zaehler <= 25){
            System.out.println("Das Quadrat von " + zaehler + " ist " + (zaehler*zaehler));
            zaehler++;
        }
    }

}
