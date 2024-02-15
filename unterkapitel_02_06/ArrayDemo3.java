package unterkapitel_02_06;

public class ArrayDemo3 {

    public static void main(String[] args) {

        // String[] jahreszeiten = {"Frühling", "Sommer", "Herbst", "Winter"};
  
        //     for (String jahreszeit: jahreszeiten) {
        //     System.out.println (jahreszeit);
        //     }
        
    int zahlen [] = {33,14,-88,500,98,64,-300};
    int groessteZahl = zahlen[0];

        // for (int i = 0; i < zahlen.length;i++){
        // if (groessteZahl > zahlen[i]){
        //     groessteZahl = zahlen[i];
        // }

            for (int aktuelleZahl: zahlen ){
                if (aktuelleZahl > groessteZahl){
                    groessteZahl = aktuelleZahl;
                }             
            }
            System.out.println(groessteZahl);
    }
}





