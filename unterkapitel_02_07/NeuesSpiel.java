package unterkapitel_02_07;

public class NeuesSpiel {

    public static void main(String[] args) {
        do {
            game();
        }while (playAgain());
    }

    public static void game(){
        int numberOfGuesses, numberToGuesse, usersGuesse;
        boolean guessedRightNumber;
        System.out.println("Neues Spielchen");
        System.out.println("-------------");

        numberOfGuesses = 0;
        numberToGuesse = getRandomNumber(1,100);

        do{
            numberOfGuesses++;
            usersGuesse = getPlayerGuesse();
            guessedRightNumber = evalueteGuesse(usersGuesse,numberToGuesse);
        } while (!guessedRightNumber);
        System.out.println("Die zu eratende Zahl war "+usersGuesse);
        System.out.println("Sie haben "+numberOfGuesses+" Versuche gebraucht");
    }

    public static boolean playAgain(){
        System.out.println("Wenn Sie npch mal spielen wollen geben sie eine 1 ein!");
        return readInt()==1;
    }

    public static boolean evalueteGuesse(int usersGuesse,int numberToGuesse){
        if (usersGuesse < numberToGuesse){
            System.out.println("Die zahl ist Größer!");
            return false;
        }
        else if (usersGuesse > numberToGuesse){
            System.out.println("DIe zahl ist kleiner!");
            return false;
        }
        else return true;
    }

    public static int getPlayerGuesse(){
        int tipp;
        System.out.println("Geben Sie eine Zahl ein: ");
        tipp = readInt();
        if (tipp < 1 || tipp > 100){
            System.out.println("Eingabe nicht korrekt geben Sie eine zahl zwischen 1 und 100 ein!"); 
        } while (tipp < 1 || tipp >100);
        return tipp;
    }

    public static int getRandomNumber(int max, int min){
        int bereich = max - min +1;
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
