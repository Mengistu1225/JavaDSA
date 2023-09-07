interface Addable{
    public void add(int a, int b);
}
public class LambdaWithTwoParameter {
    public static void main(String[] args) {
        Addable ad1=( a,b) -> {
            System.out.println("the sum of a$b : "+ a+b);
        };
        ad1.add(10,20);

        Addable ad2=(a,b) -> {
            System.out.println("the sum of a and b : "+ a+b);
        };
        ad2.add(430,237);
    }
}
