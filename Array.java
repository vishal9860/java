import java.util.*;
class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int cols;
        System.out.println("enter the rows and columns");
        rows=sc.nextInt();
        cols=sc.nextInt();
        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];
        int c[][] = new int[rows][cols]; 
        System.out.println("enter the rows and columns");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j]+ b[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println(c[i][j]+"");
            }
        }
        }

    }