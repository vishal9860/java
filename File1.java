import java.io.*;
import java.util.*;
public class File1 {
    public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int num= Integer.parseInt(br.readLine());
    String s=br.readLine();
    System.out.println(num);
    System.out.println(s);
    }
  
}
