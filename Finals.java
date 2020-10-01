public class Finals {
    public static void main(String[] args) {
        int a=10;//creating simple local variable
        final int b=20;
        a++;//local variable increment by one
        
        
        // b++; get compile time error beause this dec;ared as Final
        System.out.println(a);
        System.out.println(b);
    }
}
