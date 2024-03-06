package unterkapitel_02_07;

public class Meinemethodentest {

    public static void main(String[] args) {
        
        schreibText("War doch nicht schwer",4);
    }

    public static void schreibText(String text,int anzahl){
        for (int i=0;i<anzahl;i++){
            System.out.println(text);
        }
    }

}
