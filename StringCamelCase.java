import java.util.*;
import java.lang.*;
import java.io.*;

public class StringCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		for(int i=0; i<T;i++)
		{
		    String s=sc.next();
		    int count=0;
            for(int j=0;j<s.length();i++)
            {
                if(s.charAt(i)>=65 && s.charAt(i)<=90)
                {
                    count++;
                }
            }
		}
        
    }
    
}
