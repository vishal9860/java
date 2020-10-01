interface Vishal
{
    final int a=10;
    public void display();
}
interface Jare
{
    final int c=20;
    public void show();
}
public class Interfacess implements Vishal, Jare {
    public static void main(String[] args) {
        Interfacess obj=new Interfacess();
        obj.display();
        obj.show();
    }
    public void display()
        {
            System.out.println("interface vishal");
            System.out.println(this.a);
        }
   public void show()
    {
            System.out.println("interface jare");
            System.out.println(this.c);
    }
}
