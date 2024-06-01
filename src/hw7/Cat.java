package hw7;


public class Cat extends Pet { //繼承多型
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }

}