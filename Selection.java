import java.util.*;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            Selection_sort(arr, n);
            printarray(arr, n);
        

    }
    public static void printarray(int arr[],int n)
    {
        for (int i = 0; i < n; i++) {
          System.out.println(arr[i]);

        }
    }

    public  static void Selection_sort(int arr[], int n) {
        int temp,min,i,j,loc;
        for (i = 0; i < n-1; i++) {
            min=arr[i];
            loc=i;
            for (j=i+1; j <n; j++) {
                 if(arr[j]<min)
                 {
                     min=arr[j];
                     loc=j;
                 }

            }
            if(loc!=i)
            {
                temp=arr[i];
                arr[i]=arr[loc];
                arr[loc]=temp;
            }
        }
    }
}

