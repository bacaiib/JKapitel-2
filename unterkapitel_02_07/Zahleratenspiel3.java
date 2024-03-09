package unterkapitel_02_07;

public class Zahleratenspiel3 {

    public static void main(String[] args) {
        do {
            game();
        } while (playAgain());
        System.out.println("ciao");
        
    }

    public static void game(){
        int numberOfGuesses, numberToGuesse, usersGuesse;
        boolean gessedRightNumber;
        System.out.println("Zahlenratenspiel");
        System.out.println("----------------");

        numberOfGuesses = 0;
        numberToGuesse = getRandomNumber(1, 100);
        do {
            numberOfGuesses++;
            usersGuesse = getPlayerGuesse();
            gessedRightNumber = evalueteGuesse(numberToGuesse, usersGuesse);
        } while (!gessedRightNumber);
        System.out.println("Richtig die zu eratende nummer ist "+usersGuesse);
        System.out.println("Sie haben "+numberOfGuesses+" Versuche gebraucht");

    }

    public static boolean playAgain (){
        System.out.println("Geben Sie eine 1 ein wenn sie noch mal spielen wollen");
        return readInt () == 1;
    }

    public static boolean evalueteGuesse(int numberToGuesse, int guesse){
        if(numberToGuesse < guesse){
            System.out.println("Die nummer ist kleiner");
            return false;     
        }
        else if(numberToGuesse > guesse){
            System.out.println("Die nummer ist größer");
            return false;
        }
        else return true;
    }

    public static int getPlayerGuesse(){
        int tipp;
        do {
        System.out.println("Geben Sie ihren Tipp ein: ");
        tipp = readInt();
        if (tipp < 1 || tipp > 100){
            System.out.println("Bitte geben Sie eine Zahl zwischen 1 und 100 ein");
        }
    }while (tipp < 1 || tipp > 100);
        return tipp;
    }

    public static int getRandomNumber(int min, int max){
        int bereich = max - min + 1;
        double zufall = bereich*Math.random();
        int ergebnis = (int)(zufall)+min;
        return ergebnis;
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
