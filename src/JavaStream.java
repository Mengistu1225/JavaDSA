

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String[] args) {

        // creating stream by stream.of()
        /*
        Stream<Integer> stream=Stream.of(3,4,5,6,7,8,9,2,4,3);
        stream.forEach(p -> System.out.println(p));

        // stream.of(array)
        Stream<String> stream1=Stream.of(new String[] {"hello","mengistu","araya","kalayu","yohanis","meresa"});
        stream1.forEach(x -> System.out.println(x));*/

        // streams.of(list)
        /* List<Integer> list=new ArrayList<>();
        for (int i=0;i<=10;i++){
            list.add(i);
        }
        System.out.println(list);
        Stream<Integer> stream3=list.stream();
        stream3.forEach(y -> System.out.println(y));*/

        // stream.generate() or stream.iterate()
       /* Stream<Integer> randomNumber=Stream.generate(() -> (new Random().nextInt()));
        randomNumber.limit(20).forEach(System.out::println);*/

        // Stream of String chars or tokens

        /*IntStream stream="12345_abcdefg".chars();
        stream.forEach(a -> System.out.println(a));*/

        //or

        /*Stream<String> charStream=Stream.of("A$B$C".split("\\$"));
        charStream.forEach(c -> System.out.println(c) );*/



    }
}
