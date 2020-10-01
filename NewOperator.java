public class NewOperator {
    public static void main(String[] args) {
    Product[] obj= new Product[5];
    obj[0]=new Product(101,"dell");
    obj[1]=new Product(102,"hp");
    obj[2]=new Product(103,"Lenovo");
    obj[3]=new Product(104,"apple");
    obj[4]=new Product(105,"accer");
    for(int i=0;i<5;i++)
    {
        obj[i].display();
    }
    }
    
}
/**
 * Product
 */
 class Product {
int pro_id;
String pro_name;
Product(int pid,String name)
{
pro_id=pid;
pro_name=name;
}
public void display()
{
    System.out.println("product id="+ pro_id + " " +"product name="+pro_name);
}
}
 