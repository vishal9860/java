public class Solution { 
/*
	public static void expand(String word) 
	{ 

		StringBuilder sb = new StringBuilder(); 

		// Get all intervals 
		String[] strArr = word.split(", "); 

		// Traverse through every interval 
		for (int i = 0; i < strArr.length; i++) { 

			// Get lower and upper 
			String[] a = strArr[i].split("-"); 

			if (a.length == 2) { 

				int low = Integer.parseInt(a[0]); 
				int high = Integer.parseInt(a[a.length - 1]); 

				// Append all numbers 
				while (low <= high) { 
					sb.append(low + " "); 
					low++; 
				} 
			} 
			else { 
				sb.append(strArr[i] + " "); 
			} 
		} 

		System.out.println(sb.toString()); 
	} 
*/
	public static void main(String args[]) 
	{ 
		String s = "1-5, 8, 11-14, 18, 20, 26-29"; 
        StringBuilder sb = new StringBuilder(); 
  
        // Get all intervals 
        String[] strArr = s.split(", "); 
        System.out.println(String.valueOf(strArr));
	} 
} 
