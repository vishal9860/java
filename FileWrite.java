import java.io.*;
public class FileWrite {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("vishwa.txt",true);
        fw.write("vishal");
        char ch={'c','e','v','f'};
        fw.write(ch);
        fw.write("jarewadi\n jfhjbtrkjhkjlwgbrwlsgn");
        fw.write(100);
        fw.flush();
        fw.close();
}
}