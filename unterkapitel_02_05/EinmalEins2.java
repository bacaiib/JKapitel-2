package unterkapitel_02_05;

public class EinmalEins2 {

    public static void main(String[] args) {
        
        for (int faktor1 = 1; faktor1 <= 10;  faktor1++){
            System.out.println("Das 1 mal 1 mit dem Faktor "+faktor1);
        

        for (int faktor2 = 1; faktor2 <= 10; faktor2++){
            System.out.print(faktor1 + " mal " + faktor2);
            System.out.println(" Ergibt " + (faktor1*faktor2));
        }
        System.out.println();
       
    }

 }
}
