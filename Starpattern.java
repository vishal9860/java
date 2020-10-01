import java.util.*;
public class Starpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int n=sc.nextInt();
            int number=1;
            for(int i=1;i<=n;i++){
                for(int j=i;j<=n;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                   System.out.print(number+"  ");
                   number++;
                 }
              System.out.println("");
                }
                T--;
        }
    }
}
