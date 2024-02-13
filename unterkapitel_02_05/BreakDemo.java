package unterkapitel_02_05;

public class BreakDemo {

    public static void main(String[] args) {
        
       long testZahl = 5L;
 
     System.out.print (testZahl +" ist ");
 
        for (long i = 2; i < testZahl; i++) {
            if (testZahl % i == 0) {
            System.out.print("keine ");
            break;
            }
        }
 
     System.out.println ("Primzahl!");
   }
}


