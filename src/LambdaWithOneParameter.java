interface Sayable{
    public boolean say(String name);

}
public class LambdaWithOneParameter {
    public static void main(String[] args) {
        Sayable s1= (name) ->{
            System.out.println("hello :"+name);
            return true;
        };
        System.out.println(s1.say("mengistu"));

        Sayable s2=name -> {
            System.out.println("hello "+name);
           return true;
        };
        System.out.println(s2.say("Araya"));

        Sayable s3=name -> {
            System.out.println("hello "+name);
            return true;
        };
        System.out.println(s3.say("Kalayu"));

    }
}
