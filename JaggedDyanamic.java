import java.util.Scanner;

public class JaggedDyanamic {
    public static void main(String[] args) {
        System.out.println("enter the  rows of array");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[][] = new int[n][];
        for(int i=0;i<n;i++)
        {
            int c;
            System.out.println(" enter the column of arr"+i);
            c=sc.nextInt();
            arr[i]=new int[c];
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
               System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
        
    }
}
