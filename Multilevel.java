
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class first   // class first
{ 
	public void print_first() 
	{ 
		System.out.println("class first"); 
	} 
} 

class second extends first //class middle 
{ 
	public void print_second() 
	{ 
		System.out.println("class second or middle"); 
	} 
} 

class Three extends second //class third
{ 
	public void print_third() 
	{ 
		System.out.println("class third"); 
	} 
} 

public class Multilevel
{ 
	public static void main(String[] args) 
	{ 
        Three obj=new Three();
        obj.print_first();
        obj.print_second();
        obj.print_third();
	} 
} 
