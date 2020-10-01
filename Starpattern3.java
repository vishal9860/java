public class Starpattern3 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
