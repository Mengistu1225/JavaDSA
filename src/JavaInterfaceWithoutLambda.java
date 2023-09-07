interface Drawable{
    public void draw();
}
public  class JavaInterfaceWithoutLambda{
    public static void main(String[] args) {
        int width =10;
        Drawable dr=new Drawable() {
            @Override
            public void draw() {
                System.out.println("width "+width);
            }
        };
        dr.draw();

    }
}