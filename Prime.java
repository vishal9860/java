import java.util.Scanner;
public class prime {
   public static void main(String[] args) {
       int n,m=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number"); 
       n=sc.nextInt();
       m=n/2;
       primes(n,m);

   }
   static void primes(int n,int m)
   {
        int flag=0;
        if(n==0||n==1)
        {
            System.out.println("is not prime number"); 
        }
        else
        {
            for(int i=2 ;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
            System.out.println("prime number");
            }
        }
    }
}
