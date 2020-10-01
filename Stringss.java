import java.util.*;
import java.lang.*;
public class Stringss {
     public static void main(String[] args) {
         String s=new String("Dear  sachin Thanks A Lot");
         System.out.println(s.toLowerCase());
         String t;

        t= s.replaceAll("sachin","vishal");
         System.out.println(t);
         //problem 4
         String mystring="this string contain  and   triple spaces";
         System.out.println(mystring.indexOf("  "));
         System.out.println(mystring.indexOf("   "));
         String letter2="dear harry,\n this is java course is nice \nthanks";
         System.out.println(letter2);
        }
        
}
