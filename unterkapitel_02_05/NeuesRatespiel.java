package unterkapitel_02_05;

public class NeuesRatespiel {

    public static void main(String[] args) {
        
        int anzahlDerVersuche;
        int tipp;
        int zuErahtendeZahl = (int)(Math.random()*100)+1;
        int eingabe;

        do{
            anzahlDerVersuche = 0;

        System.out.println("Ratespiel");
        System.out.println("----------");

            do{
                anzahlDerVersuche++;
                System.out.println("Geben Sie Ihren Tipp ab: ");
                tipp = readInt();

                if (tipp < 1 || tipp > 100){
                System.out.println("Geben Sie eine Zahl zwischen 1 und 100 ein");
                }
                else if (tipp < zuErahtendeZahl){
                System.out.println("Die Zahl ist größer");
                }
                else if (tipp > zuErahtendeZahl){
                System.out.println("Die Zahl ist kleiner");
                }
            } while (tipp != zuErahtendeZahl);
                System.out.println("Richtig geraten, Sie haben "+ anzahlDerVersuche+". gebraucht");
                System.out.println("Wenn Sie noch mal spielen wollen geben sie eine 1 ein");
                eingabe = readInt();       
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
