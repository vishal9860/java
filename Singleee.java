class Parent{
    int a,b;
    Parent(int a,int b){
        this.a=a;
        this.b=b;
    }
    public int sum(){
        return this.a+this.b;
    }
}
class Singleee extends Parent {
    int m,n;
   public Singleee(int c,int d,int j,int k){
        super(c,d);
        this.m=j;
        this.n=k;
    }
    public int result(){
       return super.sum()+this.m+this.n;
    }
    public static void main(String[] args) {
        Singleee s=new Singleee(11,12,13,14);
        System.out.println(s.result());
    }
}
