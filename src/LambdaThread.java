public class LambdaThread {
    public static void main(String[] args) {
        // Thread example without lambda
        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 1 is running....");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

        Runnable r2= new Runnable() {
            @Override
            public void run() {
                System.out.println("thread 2 is running ....");
            }
        };
        Thread t2=new Thread(r2);
        t2.start();

    }
}
