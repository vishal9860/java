

import java.io.*;
class FileRead{
    public static void main(String[] args)throws IOException {
    File f=new File("vishwa.txt");
    FileReader fr=new FileReader(f);
    //int i=fr.read();
    //while(i!=-1){
        //System.out.println((char)i);
        //fr.read();

      //}
      char ch[]=new char[(int)f.length()];
      fr.read(ch);
      for (char c : ch) {
          System.out.print(c);
      }
    }
}