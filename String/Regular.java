
public class Regular {
    public static String countsame(String arr[],String s){
           String arr2[]=s.split(" ");
           int count=0;
           for(int i=0;i<arr.length;i++){
                System.out.println(arr2[i]);
               for(int j=0;j<arr2.length;j++){
                   if(arr[i]==arr2[j]){
                       count++;
                   }
               }
           }
        
    }
    public static void main(String[] args)  
    { 
        String word[] = { "welcome", "to", "geeks", "portal"}; 
          
        String str = "geeksforgeeks is a computer science portal for geeks"; 
          
        System.out.println(countsame(word, str));
          
    } 
  
} 