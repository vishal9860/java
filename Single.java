public class Parent
{
    public void dispParent()
    {
        System.out.println("disp() method of ClassParent");
    }
}
public class ClassChild extends ClassA 
{
    public void dispChilld(){
    
        System.out.println("disp() method of ClassClasschild");
    }
    public static void main(String args[])
    {
    
        ClassB b = new ClassB();
        
        b.dispParent();//calling parent class method by derived class object
        b.dispChild();//calling  child class method by child class object
    }
}