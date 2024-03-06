package unterkapitel_02_07;

public class Parametrisiertemethoden4 {

    public static void main(String[] args) {

        int ggt = computeGGT (3,5);

        System.out.println("ggt(3,5)"+ggt);
        

    }

    public static int computeGGT(int n1, int n2){
        while (n2>0){
            if (n1 > n2) n1 -= n2;
            else n2 -= n1;
        }
        return n1;
    }

}
