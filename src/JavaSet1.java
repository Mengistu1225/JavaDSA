import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaSet1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mengistu");
        list.add("araya");
        list.add("kalayu");
        list.add("yohanis");
        list.add("meresa");

        Set<String> set=new HashSet<>();
        set.addAll(list);
        System.out.println(set);
        //or
        Set<String> set2=new HashSet<>(list);
        System.out.println(set2);
    }
}
