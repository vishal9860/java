import java.util.*;
import java.lang.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T;
        T=sc.nextInt();
        while(T>0){ 
            //create String objects
            String a=new String();
            String b=new String();

            //getting input from user and srored in to String
            a=sc.nextLine();
            b=sc.nextLine();

            boolean anagram=false;
            char visited[]=new char[b.length()]; //cerating array for checking repeated character

           if(a.length()==b.length())//check whether the string is equal then execute this block wotherwise execuate else block
            {
              for(int i=0;i<a.length();i++)
                 {
                  char c =a.charAt(i); //getting character from first string and stored in to c
                  anagram=false;

                  for(int j=0;j<b.length();j++)
                    {
                     if(b.charAt(j)==c && b.charAt(j)!=visited[j])//check  two character are same or not
                      { 
                       visited[j]=b.charAt(j);
                       anagram=true;
                       break;
                       }
                   }

                   if(!anagram)//if the character is no match then then transfer the execuation of code out of the loop
                   {
                     break;
                   }
                }
              if(anagram)
              {
               System.out.println("string are anagram");
              }
              else
              {
                System.out.println("string are not anagram");
              }
            }else{
                System.out.println("string are not anagram");
               }
           
        }
       

     sc.close();





    }

    
}
