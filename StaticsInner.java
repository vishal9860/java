class Outer{
       static class Inner{
         int x=10;
    }
}
public class StaticsInner {
    public static void main(String[] args) {
        Outer.Inner myobj=new Outer.Inner();
        System.out.println(myobj.x);
    }


}
