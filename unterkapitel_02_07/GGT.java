package unterkapitel_02_07;

public class GGT {

    public static void main(String[] args) {
        
        int ggt = berechneGGT(3, 5);
        System.out.println("ggt(3,5) "+ggt);
    }

    public static int berechneGGT(int n1, int n2){
        int ggt = 1;
        for (int j = 2; j < Math.min(n1,n2);j++){
            if (n1%j==0 & n2%j == 0){
                ggt = j;
            

            }
           
           
        }
        return ggt;
    }
}
                
            
        
    
