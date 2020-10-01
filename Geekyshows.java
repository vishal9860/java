public class Geekyshows {
            public static void main(String[] args) {
                 Addition ad=new Addition();
                 ad.disp(10);        
            }
}
class Addition{
    void disp(int a)
    {
        int x = 10;
        int y = a;
        int z = x+y;
        System.out.println(z);
    }
}