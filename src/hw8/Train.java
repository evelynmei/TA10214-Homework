package hw8;

public class Train implements Comparable<Train>{
    private int number; //班次
    private String type; //車種
    private String start; //出發地
    private String dest; //目的地
    private double price; //票價

    public Train(){

    }

    public Train(int number, String type, String start, String dest, double price){
        setNumber(number);
        setType(type);
        setStart(start);
        setDest(dest);
        setPrice(price);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showTrain(){
        System.out.println("班次: " + number + ",車種: " + type + ",出發地: " + start + ",目的地: " + dest + ",票價: " + price);
    }

    @Override //為了可以直接print String
    public String toString() {
        return String.format("班次: %d,車種: %s,出發地: %s,目的地: %s ,票價: %f %n", number, type, start, dest, price);
    }
    //實作compareTo比較大小- 方法一: 透過相減比較數字實現降冪排序
    @Override
    public int compareTo(Train ob) {
        return ob.getNumber() - this.getNumber();
    }
    //                    方法二: 比較後 return 1, 0, -1 三種情況
//    @Override
//    public int compareTo(Train ob) {
//        if ( this.getNumber() < ob.getNumber()) {
//            return 1;
//        } else if( this.getNumber() == ob.getNumber()){
//            return 0;
//        } else return -1;
//    }

}
