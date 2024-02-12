package unterkapitel_02_05;

public class MeinRatespiel {

    public static void main(String[] args) {
        
        int anzahlDerVersuche;
        int zuRatendenZahl = (int)(Math.random()*100)+1;
        int tipp;
        int eingabe;

        do{
            anzahlDerVersuche = 0;

        System.out.println("Mein Ratespiel");
        System.out.println("------------");

        do {
            anzahlDerVersuche++;
            System.out.println("Geben Sie ihren Tipp ab: ");
            tipp = readInt();

            if (tipp < 1 || tipp > 100) {
                System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein");
            }

            else if (tipp > zuRatendenZahl) {
                System.out.println("Die Zahl ist kleiner");
            }

            else if (tipp < zuRatendenZahl){
                System.out.println("Die Zahl ist größer");
            }
        }   while (tipp != zuRatendenZahl); {
            System.out.println("Richtig Sie haben "+ anzahlDerVersuche + " Versuche gebraucht");
            System.out.println("Wenn Sie noch ein mal Spielen wollen geben Sie eine 1 ein");
            eingabe = readInt();
            }
        }
            while (eingabe == 1);
        
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
