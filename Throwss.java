import java.io.FileNotFoundException;

public class Throwss {
    public static void main(String[] args) throws ArithmeticException,FileNotFoundException,ClassNotFoundException{
        try{
        display();
        }
        catch(ArithmeticException e){
          System.out.println(e);
        }
    
    }
    public static void display()throws ArithmeticException {
            int c=40/0;
    }
}
