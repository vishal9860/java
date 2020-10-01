import java.io.BufferedReader;
import java.io.*;
/*solution 1
public class Java3 {
    public static String SwapFirstAndLastCharacter(String s){
            if(s.length()<2){// check if the String contain only one character and then return it
                return s;
            }
            char ch[]=s.toCharArray();// converting String into array
            int n=ch.length;//find the length of array
            char temp=ch[0];//store first character in temp
            ch[0]=ch[n-1];//set last character at 0 position
            ch[n-1]=temp;
            return String.valueOf(ch); //convert array into string
    }
    public static void main(String[] args) throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String s=br.readLine();
          System.out.println(SwapFirstAndLastCharacter(s));

    }
}
*/
//solution 2
public class Java3 {
    public static String SwapFirstAndLastCharacter(String s){
            if(s.length()<2){// check if the String contain only one character and then return it
                return s;
            }
            StringBuilder str=new StringBuilder(s);// converting String into StringBuilde
            str.setCharAt(0,s.charAt(s.length()-1));
            str.setCharAt(str.length()-1,s.charAt(0));
            return str.toString();
    }
    public static void main(String[] args) throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String s=br.readLine();
          System.out.println(SwapFirstAndLastCharacter(s));

    }
}
