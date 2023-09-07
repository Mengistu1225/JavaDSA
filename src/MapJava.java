import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapJava {
    public static void main(String[] args) {
        HashMap<String, List<String>> countries=new HashMap<>();

        // creating list of countries
        List<String> G=new ArrayList<>();
        G.add("ghana");
        G.add("greek");
        G.add("greenland");

        List<String> E=new ArrayList<>();
        E.add("Ethiopia");
        E.add("Egbuoti");
        E.add("England");
        E.add("Europian");

        List<String> I=new ArrayList<>();
        I.add("Italian");
        I.add("Ice Land");
        I.add("Iraq");
        I.add("Iran");

        List<String> A=new ArrayList<>();
        A.add("america");
        A.add("Afganstan");
        A.add("africa");
        A.add("Argentina");

        // initializing the hashmap

        countries.put("G",G);
        countries.put("E",E);
        countries.put("I",I);
        countries.put("A",A);

        // get the list of I's country
        /*List<String> Iresult=countries.get("A");
        for (String country:Iresult){

            System.out.println(country);
        }
        List<String> Aresult=countries.get("I");
        for (String country:Aresult){

            System.out.println(country);
        }
        List<String> Gresult=countries.get("G");
        for (String country:Gresult){

            System.out.println(country);
        }
        List<String> Eresult=countries.get("E");
        for (String country:Gresult){

            System.out.println(country);
        }
        //  appling  methods in maps:



        System.out.println(countries.size());
        System.out.println(countries.containsKey("r"));
        System.out.println(countries.containsValue("america"));
        System.out.println(countries.get("A"));;

        System.out.println(countries.entrySet());
        System.out.println(countries.keySet());
        System.out.println(countries.values());
        System.out.println(countries.isEmpty());
        System.out.println(" ");

        int hash=countries.hashCode();
        System.out.println(hash);
        System.out.println(countries.containsKey("G"));
        System.out.println(countries.containsValue("africa"));
        System.out.println(countries.remove("g"));

         */
        for (String key:countries.keySet()){
            System.out.println((key));
            System.out.println(countries.get(key));
        }
        for (Map.Entry<String,List<String>> entry:countries.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());

        }








    }
}
