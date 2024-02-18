package unterkapitel_02_06;

public class MeinTannenbaum {

    public static void main(String[] args) {
        
        int hoehe = 7;

        for (int i = 0; i<hoehe;i++){
            for(int j = 0;j < hoehe-1-i;j++){
                System.out.print(" ");
            }
            for (int k = 0;k < i * 2 +1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
