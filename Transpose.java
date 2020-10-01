/*Write a program to find transpose of a square matrix mat[][] of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Input:
The first line of input contains an integer T, denoting the number of testcases. Then T test cases follow. Each test case contains an integer N, denoting the size of the square matrix. Then in the next line are N*N space separated values of the matrix.

Output:
For each test case output will be the space separated values of the transpose of the matrix

Constraints:
1 <= T <= 15
1 <= N <= 20
-103 <= mat[i][j] <= 103

Example:
Input:
2
4
1 1 1 1 2 2 2 2 3 3 3 3 4 4 4 4
2
1 2 -9 -2

Output:
1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4
1 -9 2 -2

Explanation:
Testcase 1: The matrix after rotation will be: 1 2 3 4 1 2 3 4 1 2 3 4 1 2 3 4.

**/
import java.util.*;
import java.io.*;
import java.lang.*;
public class Transpose {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int t;
         t=sc.nextInt();
         while(t>0)
         {
         int n=sc.nextInt();
         int arr[][]=new int[n][n];
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 arr[i][j]=sc.nextInt();
             }
         }
         
         for(int i=0;i<n;i++)
         {
             int j=i;
             for(int x=j+1;x<n;x++) 
             {
               int temp=arr[i][x];
               arr[i][x]=arr[x][i];
               arr[x][i]=temp;
             }
         }
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<n;j++)
             {
                 System.out.print(arr[i][j]+" ");
             }
         }
         
         System.out.println();
            t--;
         }
         
        
    }
}
