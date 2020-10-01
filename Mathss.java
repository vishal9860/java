import java.math.BigDecimal;
public class Mathss{
    public static void main(String[] args) {
        double a=100;
        double b=25;
        //return min number
        System.out.println(Math.min(a, b));
        //return maximum number
        System.out.println(Math.max(a, b));
        //return sqare root
        System.out.println(Math.sqrt(b));
        int x=10;
        int y=2;
        System.out.println(Math.pow(x, y));
        BigDecimal res;
        String input1 
            = "31452678569"; 
        String input2 
            = "2468"; 
  
        // Convert the string input to BigDecimal 
        BigDecimal c = new BigDecimal(input1); 
        BigDecimal divisor  = new BigDecimal(input2); 
        res=c.divideToIntegralValue(divisor);
        System.out.println(res);
    }
}