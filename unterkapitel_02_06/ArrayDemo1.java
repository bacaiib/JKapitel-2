package unterkapitel_02_06;

public class ArrayDemo1 {

    public static void main(String[] args) {
        
        double [] zahlen;

        zahlen = new double[3];

        zahlen [0] = 4.0;
        zahlen [1] = 3.0;
        zahlen [2] = zahlen [0] * 2;

        System.out.println("erste element enthält "+zahlen[0]);
        System.out.println("zweite element enthält "+zahlen[1]);
        System.out.println("drittes element enthält "+zahlen[2]);

    }

}
