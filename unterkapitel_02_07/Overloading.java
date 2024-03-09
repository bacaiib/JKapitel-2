package unterkapitel_02_07;

public class Overloading {
 
        public static void main (String args []) {
          int   m1 = max (12, 50);
          float m2 = max (12f, 14.3f);
          float m3 = max (1f, 10f, 2.5f);
          System.out.println(m3+m2+m1);
        }
        
        public static float max (float a, float b) {
          if (a>b) return a;
          else return b;
        }
        
        public static int max (int a, int b) {
          if (a>b) return a;
          else return b;
        }
       
        public static float max (float a, float b, float c) {
          return max  ( max(a,b), c);
        }

    }


