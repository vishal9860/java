import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Exception;
public class BufferedRead {
    public static void main(String[] args)throws IoException {
        BufferedReader br=new BufferedReader(new FileReader("vishwa.txt"));
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
    }
}
