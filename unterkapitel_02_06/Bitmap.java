package unterkapitel_02_06;

public class Bitmap {

    public static void main (String args []) {
        int[][] bitmap = { 
         {0,0,1,1,1,1,1,1,1,0,0},
         {0,1,0,0,0,0,0,0,0,1,0},
         {1,0,0,1,1,0,1,1,0,0,1},                          
         {1,0,1,0,0,0,0,0,1,0,1},
         {1,0,0,0,0,1,0,0,0,0,1},
         {1,0,0,0,0,1,0,0,0,0,1},
         {1,0,0,1,0,0,0,1,0,0,1},
         {1,0,0,0,1,1,1,0,0,0,1},
         {0,1,0,0,0,0,0,0,0,1,0},
         {0,0,1,1,1,1,1,1,1,0,0} };
       
        for (int[] zeile: bitmap) {
          for (int farbe: zeile) {
     
           
           
            if (farbe == 1)
              System.out.print("*");
            else
              System.out.print(" ");
          }
          System.out.println ();
        }  
      }

}
