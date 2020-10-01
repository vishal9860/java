public class Starpattern8 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){//row
            for(int j=1;j<=i;j++){//first tringle for spaces
                System.out.print(" ");
            }for(int k=4;k>=i;k--){//second tringle for *
                System.out.print("*");
            }
            for(int r=3;r>=i;r--){//third tringle for *
                System.out.print("*");
            }
           System.out.println(" ");



        }
    }
}
