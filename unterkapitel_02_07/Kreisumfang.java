package unterkapitel_02_07;

public class Kreisumfang {

 

public static void main(String args []){

   

        double a = 13.6;
        double b = berechneU(a);
        System.out.println("Der Umfang des Kreises mit dem Radius 13,6 beträgt "+b+" cm.");
        
        }
        public static double berechneU (double a){
        a*=Math.PI;
        return a;
        }
}


