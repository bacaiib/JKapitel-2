package unterkapitel_02_07;

public class Methodenaufrufe {

    public static void main(String[] args) {
        
        System.out.println("Aufruf der println-Methode!");
        int zufall = (int)(Math.random()*100)+1;

        System.out.println("Mit der Math.random Methode kann man eine zufällige Zahl zwischen 1 und 100 aufrufen: "+zufall);
    }

}
