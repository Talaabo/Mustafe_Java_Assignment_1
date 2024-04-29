
public class Chap2_ex227 {
    public static void main(String[] args) {
        final int SIZE = 8; 
         for (int row = 0; row < SIZE; row++) {
         for (int col = 0; col < SIZE; col++) {
         if ((row % 2 == 0 && col % 2 == 0) || 
         (row % 2 != 0 && col % 2 != 0)) {
         System.out.print("* ");
             } else {
              System.out.print("  "); 
                        }
                    }
                    System.out.println(); 
                }
            }
        }
        

