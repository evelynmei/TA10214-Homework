package hw5;

public class MyRectangle {
    private double width;
    private double depth;

    //宣告有參數的建構子
    public MyRectangle( double width, double depth){
        this.width = width;
        this.depth = depth;
    }
    //宣告無參數建構子
    public MyRectangle() {

    }

    void setWidth(double width){
        this.width = width;
    }
    void setDepth(double depth){
        this.depth = depth;
    }
    //宣告計算長方形面積的方法
    double getArea(){
        return this.width * this.depth;
    }

}
