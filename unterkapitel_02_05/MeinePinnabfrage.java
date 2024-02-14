package unterkapitel_02_05;

public class MeinePinnabfrage {

    public static void main(String[] args) {
        
        int pinn = 1234;
        int eingabe;
        int anzahlDerVersuche = 0;

        System.out.println("Passwortabfrage");
        System.out.println("---------");

        do {
            anzahlDerVersuche++;
            System.out.println("Geben Sie Ihren pinn ein:");
            eingabe = readInt();
        }
        while (eingabe != pinn && anzahlDerVersuche < 3 );{

            if (eingabe == pinn){
                System.out.println("Zugriff gewährt");
            }
            else {
                System.out.println("Zugriff verweigert");
            }


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
