package unterkapitel_02_07;

public class ParametrisierteMethoden3 {

    public static void main(String[] args) {
        printRepeat("Methoden mit Parametern - sind gar nicht schwer", 4);

    }

    public static void printRepeat (String text, int anzahl){
        for (int i = 0; i < anzahl; i++){
            System.out.println(text);
        }
    }

}
