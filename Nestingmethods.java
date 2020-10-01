public class Nestingmethods {
    public static void main(String[] args) {
        Nestingmethods obj=new Nestingmethods();
        obj.add(10,20,20);
        obj.add(25,25);
    }
    int add(int a,int b,int c)
    {
     
     int z;
     z=a+b+c;
     System.out.println("the value of z is"+z);
     return 0;
    }
     int add(int a,int b)
    {
       int x=a+b;
       System.out.println("the value of z is"+x);
       return 0;
    }
}

