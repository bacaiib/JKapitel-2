package unterkapitel_02_05;

public class Fakulteat {

    public static void main(String[] args) {
        
        int x = 6;
        long y = 1;
        int z = x;


        while ( x >= 2){
            y *= x;
            x--;

        }
        System.out.print("Die Fakulteat von "+z);

        System.out.print(" ist " + y);
    }

}
