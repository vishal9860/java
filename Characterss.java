import java.lang.Character.*;
import java.lang.Integer;
public class Characterss {
    public static void main(String[] args) {
    String s= " VisHa98L ";
    String letter="";//storing the letter from particular string
    String digit="";//storing the digit from particular string
    String Uppercase="";//storing uppercase letter 
    int count=0;//count uppercase letter
    
    for(int i=0;i<s.length();i++){
       
        if(Character.isLetter(s.charAt(i))){//isLetter method return if letter than return true
          letter=letter+s.charAt(i);
        }
        
        if(Character.isDigit(s.charAt(i))){//if element is digit then return true
                digit=digit+s.charAt(i);
        }
        if(Character.isUpperCase(s.charAt(i))){
            Uppercase=Uppercase+s.charAt(i);
            count++;
        }
           
    }
    System.out.println(letter);
     System.out.println(Uppercase);
     System.out.println(count);
}
}
