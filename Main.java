class Parent{
    int maxspeed=120;
    public void display(){
        System.out.println(this.maxspeed);
    }
}
class Child extends Parent
{
    int maxspeed=100;
    public void display(){
        super.display();
        System.out.println(this.maxspeed);
    }
}
public class Main {
    public static void main(String[] args) {
        Child obj=new Child();
    obj.display();
    System.out.println(obj instanceof Child);
    }
    
}
