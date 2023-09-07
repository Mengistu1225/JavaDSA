import java.util.*;

public class JavaSet2 {
    public static void main(String[] args) {
        // treeset and hashset are equals but treeset are ordered or in sorted mannar
        // hashmap is very fast
        Set<Integer> set3=new TreeSet<>();
        set3.add(10);
        set3.add(30);
        set3.add(20);
        set3.add(89);
        set3.add(90);
        set3.add(67);
        set3.add(23);
        System.out.println(set3);

        //linkedhashset is equal with hashset but when it add elements to the set in the insertion elements to the set
        // linkedhashset is faster than hashset
        Set<String> set4=new LinkedHashSet<>();
        set4.add("mengistu");
        set4.add("araya");
        set4.add("kalayu");
        set4.add("yohanis");
        set4.add("meresa");

        System.out.println(set4);
    }
}
