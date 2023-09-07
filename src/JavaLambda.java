interface CanDrawable{
    public void canDraw();
}
public class JavaLambda  {
    public static void main(String[] args) {
        /*
        () -> {
            body with no parametres
        }
        */

        /*
        (p1) ->{
            body with single parameery
        }
        */

      /*  (p1,p2) -> {
            body with two parameter
        }
        */
        int width=100;
        /*CanDrawable draw=new CanDrawable() {
            @Override
            public void canDraw() {
                System.out.println(" the width is : "+width);
            }
        };
        draw.canDraw();*/

        // Java Lambda Expression Example: No Parameter
        CanDrawable d2=() ->{
            System.out.println(" widht :"+width);
        };
        d2.canDraw();

    }
}
