

public class NewInner {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner myinner=o.new Inner();
        System.out.println(o.x);
        System.out.println(myinner.y);
    }
}
class Outer{
     int x=10;
     class Inner{
    int y=20;
     }
}
