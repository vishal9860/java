import java.util.Scanner;


class StringBuffe
{
    public static void main(String[] args) {
        StringBuffer Bf=new StringBuffer("vishal");
        Scanner sc=new Scanner(System.in);
        Bf.append("jare");
        char c[]={'j','a','r','e','w','a','d','i'};
        Bf.append(c);
        System.out.println(Bf);
        sc.close();
        System.out.println(Bf.charAt(0));//return character from 0 position
        System.out.println(Bf.length());//return int length
        System.out.println(Bf.indexOf("jare"));//returning the index
        System.out.println(Bf.lastIndexOf("jare"));
       // System.out.println(Bf.deleteCharAt(0));
        System.out.println(Bf);
       // Bf.setCharAt(0,'v');
        System.out.println(Bf);
        System.out.println(Bf.replace(0,6,"vishwa"));
        System.out.println(Bf);
    }
    
    
}