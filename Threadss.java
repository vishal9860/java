import java.lang.Exception;
public class Threadss extends Thread {
    public void run(){
        for (int i = 0; i <10; i++) {
             System.out.println(" "+i);
             try{
                 Thread.sleep(2000);
            }catch(Exception e){

            }
        }
    }

      public static void main(String[] args) {
          Threadss ts=new Threadss();
          ts.start();
      }
}
