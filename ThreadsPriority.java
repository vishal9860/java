class user extends Thread{
    public void run(){
        for (int i = 0; i <10; i++) {
            System.out.println(i);
        }
    }
}
public class ThreadsPriority {
    public static void main(String[] args) {
        user us=new user();
        us.setPriority(10);
        us.start();
        for (int i = 0; i <5; i++) {
            System.out.println(i*2);
        }
    }
}
