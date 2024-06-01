package hw7;


public class Dog extends Pet { //繼承多型
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }
}