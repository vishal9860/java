// Java program to remove vowels from a String 

import java.util.Arrays; 
import java.util.List; 

class StringVowel
{	 
	static String remVowel(String str) 
	{ 
        str=str.replaceAll("[AEIOUaeiou]"," ");
        return str;

	} 
	// Driver method to test the above function 
	public static void main(String[] args) 
	{ 
		String str = "GeeeksforGeeks - A Computer Science Portal for Geeks"; 
		
		System.out.println(remVowel(str)); 
	} 
} 
