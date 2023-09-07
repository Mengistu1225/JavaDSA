import java.util.ArrayList;
import java.util.List;

public class LambdawithForeachLoop {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mengistu");
        list.add("araya");
        list.add("kalayu");
        list.add("yohanis");
        list.add("meresa");

        list.forEach(
                (n) -> System.out.println(n)
        );
    }
}
