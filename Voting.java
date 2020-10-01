import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String s) throws YoungerAgeException
    {
        super(s);
    }
}
class Voting{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your age");
       int age=sc.nextInt();
       try{
           if(age<18){
               throw new YoungerAgeException("you are not eligible for vote");
             }
          else{
               System.out.println("voting succesfull");
              }
          }catch(YoungerAgeException e)
          {
              System.out.println(e.getMessage());
          }
       System.out.println("hello");
    }
}