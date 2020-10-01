 class Test {
    public String name;
    public int age;
    public Test(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String display(){
        return("name of teacher is"+name+"age is"+age);
    }
}
 class Teacher extends Test
{
     String sub;
     long sal;
     public Teacher(String name,int age,String subject,long salary){
         super(name,age);
         sub=subject;
         sal=salary;

     }
     public String display()
     {
         return(super.display()+"subject is"+subject+"and salary is"+salary);
     }
}
class Simple
{
    public static void main(String[] args) {
        Teacher obj=new Teacher("vishal",22,"java",500000);
        System.out.println(obj.display());
    }
}