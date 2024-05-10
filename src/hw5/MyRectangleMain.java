package hw5;

public class MyRectangleMain {
    public static void main(String[] args) {
        //呼叫無參數建構子
        MyRectangle noArgs = new MyRectangle();
        noArgs.setWidth(10);
        noArgs.setDepth(20);
        System.out.println(noArgs.getArea());

        //呼叫有參數建構子
        MyRectangle withArgs = new MyRectangle( 10, 20);
        System.out.println(withArgs.getArea());
    }
}
