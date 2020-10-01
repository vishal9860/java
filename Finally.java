public class Finally {
    public static void main(String[] args) {
        try {
            int num=100/0;
        } catch (ArithmeticException e) {
           System.out.println("we do not num divisible by 0");
        }finally{
            System.out.println("in final block");
        }
    }
}
