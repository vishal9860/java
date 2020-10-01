
import java.io.*;
public class Code {
    public static void main(String[] args)throws IoException {
    PrintWriter pw=new PrintWriter("file3");
    BufferedReader br=new BufferedReader(new FileReader("file1"));
    BufferedReader brr=new BufferedReader(new FileReader("file2"));
    String line=br.readLine();
    while(line!=null){
        pw.println(line);
        line=br.readLine();
    }
    String sentenc=brr.readLine();
    while(line!=null){
        pw.println(sentenc);
        sentenc=brr.readLine();
     } 
  }
}