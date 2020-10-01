import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            bubble_sort(arr, n);
            printarray(arr, n);
    

    }
    public static void printarray(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
          System.out.println(arr[i]);

        }   
    }

    public  static void bubble_sort(int arr[], int n) {
        int temp;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                 if(arr[j]>arr[j+1])
                 {
                     temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                 }

            }
        }
    }
}
