
import java.util.Arrays;
public class Strings {
    public static void main(String[] args) {
        String s1 = "vishal";
        String s2 = new String("sachin");
        StringBuffer s4=new StringBuffer("vishal");
        System.out.println(s1.contentEquals(s4));
        int l = s1.length();
        System.out.println("length is"+l);
        System.out.println("check is empty"+s1.isEmpty()); 
        System.out.println("character at position 2 is"+s1.charAt((2)));
        System.out.println("substring"+s1.substring(2));
        System.out.println("substring of index 2 to 5 is"+s1.substring(2,5));
        System.out.println("check equals"+s1.equals(s2));
        System.out.println("lowercase"+s1.toLowerCase());
        System.out.println("uppercase"+s1.toUpperCase());
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("trim"+s1.trim());
        System.out.println(" character place at index 1 "+s1.indexOf(1));
        System.out.println("index of is "+s1.indexOf("is"));
        System.out.println("replace "+s1.replace('i','I'));
        System.out.println(s1.compareTo(s2));
        char ch[]=s1.toCharArray();
        System.out.println(s1.compareTo(s2));
        System.out.println("whether the String is empty "+s1.isEmpty());
        Arrays.sort(ch); 
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
    
    }
} 
