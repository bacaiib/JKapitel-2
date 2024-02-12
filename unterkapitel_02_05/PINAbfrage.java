package unterkapitel_02_05;

public class PINAbfrage {

    public static void main(String[] args) {
        
        int anzahlDerVersuche;
        int eingabe;
        int passwort = 1234;

        anzahlDerVersuche = 0;
        
         System.out.println("Passwort Abfrage");
        do {
            anzahlDerVersuche++;
            System.out.println("PASSWORT "+ anzahlDerVersuche + " Versuch:");
            eingabe = readInt();
          
        }
        while (eingabe != passwort && anzahlDerVersuche < 3);

            if (eingabe == passwort){
                System.out.println("Zugang gewährt");
            }
            else {
                System.out.println("Zugang verweigert");
            }
       
        
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
