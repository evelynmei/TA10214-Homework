package hwext;

public class Pencil extends Pen{

    public Pencil() {

    }
    public Pencil(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void write() {
        System.out.println("削鉛筆再寫");
    }

//    @Override
//    public void setPrice(double price) {
//        super.setPrice(price * 0.8);
//    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
