import java.io.*;

public class PrintWrite {
    public static void main(String[] args) {
        PrintWriter pw=new PrintWriter("vishwa.txt");
        pw.write(10);
        pw.write("vishal");
        pw.print(11);
        pw.print("jare");
        pw.print(200);
        pw.println("jarewadi");
        pw.flush();
        pw.close();

    }
}
