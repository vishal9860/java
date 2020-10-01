import java.lang.RuntimeException;
class Myexception extends RuntimeException
{
   Myexception( String s){
       super(s);
}
 class Exc {
        public static void main(String[] args) {
            int age=15;
            if(age>18){
                      throw new Myexception("you are not eligible for voting");
              }
            else{
                 System.out.println("vote succesfully");
            }
        }       
}