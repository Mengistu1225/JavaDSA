import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollector {
    public static void main(String[] args) {

       /* // Collect Stream elements to a List
List<Integer> list=new ArrayList<>();
        for (int i=0;i<=20;i++){
            list.add(i);
        }
        Stream<Integer> streamList=list.stream();
        List<Integer> evenNumberList=streamList.filter(i -> i%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumberList);
*/

    /*    //Collect Stream elements to an Array
List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i< 10; i++){
            list.add(i);
        }

        Stream<Integer> stream = list.stream();
        Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0)
                .toArray(Integer[]::new);
        System.out.print(evenNumbersArr);
     */

        // stream operations
           // 1 stream.filter()
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
  memberNames.stream().filter((s) -> (s.startsWith("A")))
                .forEach(System.out::println);

            // 2 stream.map()
        memberNames.stream().filter((s) -> s.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
            // 3 stream.sort()
        memberNames.stream().sorted().map(String::toUpperCase)
                .forEach(System.out::println);


        // Terminal operations
          // 1 stream.foreach()
          // 2 stream.collect()

          // 3 stream.match()
        boolean matchResult=memberNames.stream().anyMatch((s) -> s.startsWith("S"));
        System.out.println(matchResult); // == true
        matchResult=memberNames.stream().allMatch((s) -> s.startsWith("A"));
        System.out.println(matchResult);   // ==false
        matchResult=memberNames.stream().noneMatch((s) -> s.startsWith("A"));
        System.out.println(matchResult); // == false

           // 4 stream.count()
        long totalMatched=memberNames.stream().filter((s) -> s.startsWith("A"))
                .count();
        System.out.println(totalMatched);

          // 5 stream.reduce()
        Optional<String> reduced=memberNames.stream()
                .reduce((s1,s2) -> s1+ " # "+ s2);
        reduced.ifPresent(System.out::println);

        // Short-circuit Operations

           // 1 stream.anyMatch()
        boolean matched = memberNames.stream()
                .anyMatch((s) -> s.startsWith("A"));

        System.out.println(matched); // ==true
          // 2 stream.findFirst()
        String firstMatchedName=memberNames.stream().filter((s) ->s.startsWith("S"))
                .findFirst().get();
        System.out.println(firstMatchedName);








    }
}
