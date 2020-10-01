import java.util.Scanner;
public class Fibbo {
    public static void main(String[] args) {
        int n1=0,n2=1,n;
        System.out.println("enter the size of fibonacci");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Fibbonacci(n1,n2,n);
    }
  public static void Fibbonacci(int n1,int n2,int n)
  {
      int next;
      System.out.println(n1+""+n2);
      for(int i=2;i<n;i++)
      {
          next=n1+n2;
          System.out.println(next);
          n1=n2;
          n2=next;
      }
  }
}
