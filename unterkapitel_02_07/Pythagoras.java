package unterkapitel_02_07;

public class Pythagoras {

    public static void main(String[] args) {
        
        double a = 2.6;
        double b = 3.6;
        double c = Math.hypot(a, b);

        System.out.println("Die Hypotenuse für das Dreick aus a und b ist: "+c);
    }

}
