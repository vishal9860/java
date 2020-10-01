import java.lang.Exception;
public class Threa extends Thread {
    public void run()
    {
        for (int i = 0; i <10; i++) {
            System.out.println(" "+i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
    }
    public static void main(String[] args) {
        Threa s=new Threa();
        s.run();
    }
}
