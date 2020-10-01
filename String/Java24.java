public class Java24 {
    public static boolean isvowel(char c){
        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')){
            return true;
        }
        return false;
    }
    public static void remove(String s){
        System.out.println(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!isvowel(s.charAt(i-1))||!isvowel(s.charAt(i))){
                System.out.print(s.charAt(i));
            }

        }
    }
    public static void main(String[] args) {
        String str="geekaafii";
        remove(str);
    }
}
