/* Given an array A of size N, print the reverse of it.

Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

Output:
For each testcase, in a new line, print the array in reverse order.

Constraints:
1 <= T <= 100
1 <= N <=100
0 <= Ai <= 100

Example:
Input:
1
4
1 2 3 4
Output:
4 3 2 1

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseArray{
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		 int T= Integer.parseInt(sc.nextLine());
		 int temp;
		 for(int i=0;i<T;i++)
		 {
		     temp=0;
		     int N= sc.nextInt();
		     sc.nextLine();
		     int Arr[]= new int[N];
		     for (int j=0;j<N;j++)
		        {
		         Arr[j]= sc.nextInt();
		        }
		     int k = N-1;
		     int n = 0;
		     while(k>n)
		        {
		         temp= Arr[k];
		         Arr[k]=Arr[n];
		         Arr[n]= temp;
		         k--;
		         n++;
		        }
		        
		      for (int l=0;l<N;l++)
		        {
		         System.out.print(Arr[l] + " ");
		        }
		      
		      System.out.println();
		 }
		 

	}
}
