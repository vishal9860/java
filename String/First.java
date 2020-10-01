public class First {
    public static void main(String[] args) {
        String s="VishaL@JaRe12*";
        int uppercase,lowercase,number,special;
        uppercase=0;
        lowercase=0;
        number=0;
        special=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'){
                 uppercase++;
            }
            else if(c>='a'&&c<='z'){
              lowercase++;
            }
            else if(c>='0'&&c<='9'){
                number++;
              }
              else{
                  special++;
              }
        }

        System.out.println("Lower case letters : " + lowercase); 
        System.out.println("Upper case letters : " + uppercase); 
        System.out.println("Number : " + number); 
        System.out.println("Special characters : " + special); 
    }
}
