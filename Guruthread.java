
 
public class Guruthread implements Runnable
{
       public static void main(String[] args) {
        Thread guruthread1 = new Thread("Guru1");
        Thread guruthread2 = new Thread("Guru2");
        guruthread1.start();
        guruthread2.start();
        System.out.println("Thread names are following:");
        System.out.println(guruthread1.getName());
        System.out.println(guruthread2.getName());
    }
    @Override
    public void run() {
    }
 
}