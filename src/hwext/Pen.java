package hwext;

public abstract class Pen {
    private String brand;
    private double price;

    //無參數建構子
    public Pen(){
        this("SKB", 100);
    }
    //有參數建構子
    public Pen(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getBrand(){
        return brand;
    }
    public double getPrice(){
        return price;
    }

    public void showInfo() {
        System.out.println("這支筆價格" + getPrice());
    }
    //抽象方法
    public abstract void write();
}
