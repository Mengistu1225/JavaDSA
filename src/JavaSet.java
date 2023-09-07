import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(10);
        set1.add(30);
        set1.add(20);
        set1.add(89);
        set1.add(90);
        set1.add(67);
        set1.add(23);

        // basic set operations

        System.out.println(set1);
        set1.remove(89);
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.contains(30));
        System.out.println(set1.isEmpty());
        //set1.clear();
        for (int set: set1){
            System.out.println(set);
        }
        set1.forEach(System.out::println);
        Iterator<Integer> it= set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
