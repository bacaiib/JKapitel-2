package unterkapitel_02_05;

public class Zahlenratespiel {

    public static void main(String[] args) {
        
        int tipp, zuRatendenZahl, anzahlDerVersuche;
        int eingabe;

        do{

        System.out.println("Zahlenratenspiel");
        System.out.println("-------------");

        anzahlDerVersuche = 0;
        zuRatendenZahl = (int)(Math.random()*100)+1;

        do {
            System.out.println("Ihr tipp:");
            tipp = readInt();

            if (tipp < 1 || tipp > 100){
                System.out.println("Ihre Eingabe ist nicht korrrekt");
                System.out.println("Bitter geben Sie eine Zahl zwischen 1 und 100 ein");
                continue;
            }
             anzahlDerVersuche++;

             if (zuRatendenZahl < tipp){
                System.out.println("Die zu Erantende Zahl ist kleiner");}
             

             else if (zuRatendenZahl > tipp){
                System.out.println("Die zu Eratende Zahl ist größer");}
             
            }
             while (zuRatendenZahl != tipp);{
                System.out.println("Richtig die zu Eratende Zahl war " + zuRatendenZahl);
                System.out.println("Sie haben " + anzahlDerVersuche + " gebraucht");

                System.out.println("Geben Sie eine 1 ein, wenn Sie noch mal spielen wollen");
                eingabe = readInt();
             }
            }
             while (eingabe == 1);
             System.out.println("cioa");
    }
        
    
    

    public static int readInt () {
             java.io.BufferedReader br;
             br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
             try {
               return Integer.parseInt (br.readLine());
             }
             catch (Exception ex) {
               return 0;
             }
   }
}
