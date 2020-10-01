// Java program to illustrate 
// Call by Value 

// Callee 
class CallByValue { 

	// Function to change the value 
	// of the parameters 
	public static void Example(int x, int y) 
	{ 
		x++; 
        y++; 
        System.out.println(""+x+""+y);
	} 
} 

// Caller 
public class PassByValue { 
	public static void main(String[] args) 
	{ 

		int a = 10; 
		int b = 20; 

		// Instance of class is created 
		CallByValue object = new CallByValue(); 

		System.out.println("Value of a: " + a 
						+ " & b: " + b); 

		// Passing variables in the class function 
		object.Example(a, b); 

		// Displaying values after 
		// calling the function 
		System.out.println("Value of a: "
						+ a + " & b: " + b); 
	} 
} 
