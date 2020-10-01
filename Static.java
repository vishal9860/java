public class Static {
    public static void main(String[] args) {
        disp();
        Test.func();
    }
    static void disp()
    {
        System.out.println("this is another static method");
    }
}
class Test
{
    static void func()
    {
        System.out.println("test class static method");
    }
}