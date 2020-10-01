import java.lang.Exception;
class UserThreads extends Thread{
    public void run(){
        try{
            for(int i=0;i<10;i++){
               System.out.println(" "+i);
           }
        }catch(Exception e){

        }
    }
}





public class Threadop {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        UserThreads thr=new UserThreads();
        System.out.println(thr.getPriority());
         System.out.println("program was end");
    }
}
