import java.util.Scanner;
import java.lang.Character;
import java.lang.Integer;
public class String1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); //create scanner class object or giving input from user
            int t;
            t=s.nextInt();//storing test case in t
            while(t>0){ //t is greter than 0
                String sp=new String();
                sp=s.nextLine();
                int sum=0;
                String temp="";
                for(int i=0;i<sp.length();i++){
                    char ch=sp.charAt(i);
                    if(Character.isDigit(ch)){
                        temp=temp+ch;
                    }else{
                        sum=sum+Integer.parseInt(temp);
                        temp="0";
                    }

                }
                System.out.println(sum);
           }
           s.close();
        
    }
}
