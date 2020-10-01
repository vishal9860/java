import java.lang.*;
import java.io.*;
import java.util.*;
public class Java8 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        StringBuilder str=new StringBuilder(s);
        str.reverse();
        System.out.println(str.toString());
    }
}
