package unterkapitel_02_07;

public class NocheinTest {

    public static void main(String[] args) {
        int a = 3, b = -10;

        System.out.print(a+" ist");
        test(a);
        System.out.print(b+ " ist");
        test(b);

    }

    public static void test(int a){
        if (a<0){
            System.out.println(" negativ");
        } else {System.out.println(" posotiv");}
    }

}
