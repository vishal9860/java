public class Exceptions {
    public static void main(String[] args) {
     String s=null;
     int a=10;
     int b=0;
     int c=0;
     try {
         c=a/b;
         int arr[]=new int[10];
         arr[11]=10;
     } catch (ArithmeticException e) {
         System.out.println("we do not divide by 0");
     }
     catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Array size is less than your size");
     }
     finally{
     System.out.println("bhjvbhvf");
     }
    }
}
