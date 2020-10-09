import java.util.*;

public class Addition {
    public static void main(String[] args) { 
        int rows,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and column size");
        rows =sc.nextInt();/*input rows*/
        cols =sc.nextInt();/*input cols*/
        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];
        int c[][]=new int[rows][cols];

        System.out.println("enter the  1st array");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter the  2nds array");
        for(int i=0;i<rows;i++)
           {
            for(int j=0;j<cols;j++)
                {
                b[i][j]=sc.nextInt();
                }
           }

           /* addition*/
           for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        /*displaying*/
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++) 
            {
               System.out.println(c[i][j]+"");
            }
            
        }
           System.out.println("vishal jare");
    }
}
