package unterkapitel_02_01;

public class Altersumrechnung {

    public static void main(String args[]){

        int alterInJahren;
        int alterInTagen;
        int alterInStunden;
        int alterInMinuten;
        String name;

        name = "Peter";
        alterInJahren = 33;
        alterInTagen = alterInJahren * 365;
        alterInStunden = alterInTagen * 24;
        alterInMinuten = alterInStunden * 60;

        System.out.println(name + " ist " + alterInJahren + " Jahre alt, und das entspricht " + alterInTagen + " Tagen!");
        System.out.println(alterInTagen+" Tage, entsprechen widerum "+alterInStunden+" Stunden!");
        System.out.println(alterInStunden+" Stunden, entsprechen daher "+alterInMinuten+" Minuten!");

    }

}
