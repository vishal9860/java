import java.util.*;
import java.lang.*;
public class Stringg {
     public static void main(String[] args) {
         String s=new String("avbkjd1122klj4 543 af");// creating String using new operator
         String St=extractint(s);//call extractint and that return the extracted string assign in st
         System.out.println(St);
     }
    public static String extractint(String str){//that function return extracted int number
        
        str=str.replaceAll("[^\\d]"," "); //replace all digit and whitespaces and store into str
        //remove white spaces from both end
        str=str.trim();
        //replace all consecutive white space  and single space
        str=str.replaceAll("+"," ")
        if(str.equals(" "))
        {
            return -1;
        }
        return str;

    }
}
