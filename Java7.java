public class Java7 {
    public static void main(String[] args) {
        String str="I love java programing";
        String s[]=str.split(" ");
        String c="";
        for(int i=s.length-1;i>=0;i--){
            c=c+s[i]+" ";
        }
        System.out.println(c);
    }
}
