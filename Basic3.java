public class Basic3 {
//Java program to illustrate coditional operators 
	public static void main(String args[]) 
	{ 
		int num1 = 4; 
		int num2 = 5; 
		
		//using conditional operator 
		num1 = num1>num2 ? num1 - num2 : num1 + num2; 
		
		//num1 stores the value after evaluation of either second 
		// or third expression depending on the condition 
		//provided in the first expression 
		//num1 becomes 4+5 = 9 
		
		//printing num1 
		System.out.println(num1); 
		
	} 
} 
