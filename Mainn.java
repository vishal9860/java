import java.io.*;
import java.lang.Exception;
 class Mainn {
    public static void main(String[] args) {
        File f=new File("abc.txt");
        int count=0;
        File f2=new File("C:\\Users\\danyj\\Desktop");
        String s[]=f2.list();
            for(String s1:s){
                //System.out.println(s1);
                //print only file names in this directory
                File f3=new File(f2,s1);
                if(f3.isDirectory()){
                    System.out.println(s1);
                    count++;
                }
                
            }
        System.out.println(f.length());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.exists());
        System.out.println(count);
        try{
        f.createNewFile();
        }catch(Exception e){}
        System.out.println(f.exists());
    }
}
