import java.util.Scanner;

public class MatrixPosition {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        int [][] mat = new int[m][n];

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nFind element: ");
        int element = sc.nextInt();

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == element) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.printf("%nPosition %d, %d%n" ,i ,j);

                    System.out.print(j > 0 ? "Left: " + mat[i][j-1] : "");                
                    System.out.print(i > 0 ? "\nUp: " + mat[i-1][j] : "");
                    System.out.print(j < mat[i].length - 1 ? "\nRight: " + mat[i][j+1] : "");
                    System.out.print(i < mat.length - 1 ? "\nDown : " + mat[i+1][j] : "");
                }
            }
        }

        System.out.println();

        sc.close();
    }
    
}