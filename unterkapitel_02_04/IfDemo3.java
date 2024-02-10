package unterkapitel_02_04;

public class IfDemo3 {

    public static void main(String[] args) {
        
        int alter;

        System.out.println("Wie alt sind Sie?");
        alter = readInt();

        if (alter < 3 || alter > 99){
            System.out.println("Ungültige Zahl geben Sie eine Zahl zwischen 3 und 99 ein!");
        } else {
            System.out.println(" Sie sind also " +alter+ " Jahre alt");
        }

        if (alter <= 18 && alter > 12 ){
            System.out.println("Sie sind also ein Teenager!");

        } else if (alter > 18){
            System.out.println("Sie sind ein Erwachsener");

        } else if (alter <= 12){
            System.out.println("Sie sind noch ein Kind");
        } 
    }



    public static int readInt () {
             java.io.BufferedReader br = 
              new java.io.BufferedReader(new java.io.InputStreamReader
                (System.in));
             try {return Integer.parseInt (br.readLine());} 
              catch (Exception ex) {return 0;}
            }

        }

