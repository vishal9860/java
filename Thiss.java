public class Thiss {
    int a=10;
    static int b=20;
    public void display(){
        this.a=100;//current object refer to instance variable and assign 100
        this.b=200;
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        new Thiss().display();
    }
}
