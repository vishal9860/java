import java.util.*;
import java.lang.Character;
public class StringDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String("1234");
        int n=s.length();
       System.out.println(checkDigits(s, n));
       
    }
     public static boolean checkDigits(String s,int n){
        for(int i=0;i<n;i++){
            if(Character.isDigit(s.charAt(i))){
                System.out.println("vishal");
                return true;
                
            }
            else
            {
                return false;
            }
        }
        return false;
        
     }

}