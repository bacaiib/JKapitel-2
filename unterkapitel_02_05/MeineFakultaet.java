package unterkapitel_02_05;

public class MeineFakultaet {

    public static void main(String[] args) {
        
        long x = 6;
        long y = 1;

        System.out.println("Die Fakultaet von " + x);

        while (x>=2){
            y *= x;
            x--;
        }
        System.out.println(" ist " +y);
    }

}
