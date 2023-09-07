import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;

    public Product(int id,String name,float price){
        super();
        this.id=id;
        this.name=name;
        this.price=price;
    }

}
public class lambdaComparator {
    public static void main(String[] args) {
       /* List<Product> list=new ArrayList<>();
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));


        System.out.println("sorting the list bases of the name ");
        Collections.sort(list,(p1,p2) ->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p: list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }*/
        List<Product> list1=new ArrayList<Product>();
        list1.add(new Product(1,"Samsung A5",17000f));
        list1.add(new Product(3,"Iphone 6S",65000f));
        list1.add(new Product(2,"Sony Xperia",25000f));
        list1.add(new Product(4,"Nokia Lumia",15000f));
        list1.add(new Product(5,"Redmi4 ",26000f));
        list1.add(new Product(6,"Lenevo Vibe",19000f));

        System.out.println("stream filtered data");
        Stream<Product> filterd_data=list1.stream().filter((p) -> p.price >=20000);

        filterd_data.forEach(product -> System.out.println(product.name +":"+product.price));
    }
}
