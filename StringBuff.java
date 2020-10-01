public class StringBuff {
    public static void main(String[] args) {
     StringBuffer sb=new StringBuffer("hello");
     sb.append("vishal");
     System.out.println(sb); 
     String s=sb.substring(5);
     System.out.println(s); 
     String s2=sb.substring(5,11);
     System.out.println(s2); 
     System.out.println(sb.equals(s2));
     System.out.println(sb.reverse()); 
     
    }
}