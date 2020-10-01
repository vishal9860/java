public class Shallowobject {
    public static void main(String[] args) throws CloneNotSupportedException{
        Abc obj=new Abc();
        obj.a=10;
        obj.b=20;
        //Abc obj1=new Abc();//creating deep copy
        //obj1.a=obj.a;//
        //obj1.b=obj.b;//
      
        //cloning
        Abc obj1=(Abc)obj.clone();



        //Abc obj1=obj;// cerating shallow object means creatibg 2 refrence and only one objects
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj1.a);
        System.out.println(obj1.b);

    }
}
class Abc implements Cloneable{
    int a;
    int b;
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}
