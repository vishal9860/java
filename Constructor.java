import java.util.*;
public class Constructor {
    int a;
    String v;
    Constructor(){                //default constructor
        System.out.println("this  is default  constructor");
    }

    Constructor(int x,String s){         //parameterized constructor that takes two arguments
        this.a=x;
        this.v=s;
    }


    public void display()
    {
        System.out.println("the value of a is "+a);
        System.out.println("the string is "+v);
    }


     public static void main(String[] args) {
        Constructor obj1=new Constructor();
        Constructor obj2=new Constructor(10,"vishal");
        obj2.display();
        

    }
}
