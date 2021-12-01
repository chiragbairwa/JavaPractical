import java.util.Scanner;
 
class j11{
 
    public static void main(String[] args) {
        int i, j, k;
        int first[][] = {{2,1},{3,2}};
        int second[][] = {{3,1},{1,4}};
        int product[][] = new int[2][2]; 
        
 
        // Multiplying two matrices
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                for (k = 0; k < 2; k++) {
                    product[i][j] += first[i][k] * second[k][j];
                }
            }
        }

        // Printing First Matrix
        System.out.println("First Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(first[i][j] + " ");
            }
            System.out.print("\n");
        }
        // Printing Second Matrix
        System.out.println("Second Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(second[i][j] + " ");
            }
            System.out.print("\n");
        }
        // Printing Product Matrix
        System.out.println("Product Matrix");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}