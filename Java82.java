import java.util.Scanner;
import java.util.*;
import java.lang.*;
public class Java82 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        for (int i = ch.length-1; i>=0; i--) {
              System.out.print(ch[i]);
        }
    }
}
