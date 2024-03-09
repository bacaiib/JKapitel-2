package unterkapitel_02_07;

public class Potenz {

    public static void main(String[] args) {
        
     
        System.out.println(potenzB(2, 4));
    }



    public static int potenzB(int n1, int n2){
        int j = n1;
        while (n2>1){
           n1*=j;
           n2--;
        }
        return n1;
    }

}
