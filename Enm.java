/* 

    enum in JAVA:

        enum are named constatns, all the constatnts are object of the Enum class

        enum extends a Enum class in JAVA, so it have constructor, methods as well.

        enum can implements other interfaces as well.

        Note: enum constructors in Java must be either private or package-private
        (the default access modifier). If you attempt to declare an enum constructor as public 
        or protected, it will result in a compile-time error.

*/

interface A{
    void show();
}

enum Laptop implements A {
    Dell(2000), Macbook(1900);

    private int price;
    private Laptop(int price) {
        this.price = price;
    }

    @Override
    public void show() {
        System.out.println("we cam implements interfaces in enum");
    }

    public int getPrice() {
        System.out.println(this.name()+": "+price);
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class Enm {
    public static void main(String[] args) {
        Laptop dell = Laptop.Dell;

        if (dell == Laptop.Dell) {
            System.out.println("If condition check on enum");
        }

        dell.getPrice();
        dell.show(); // we cam implements interfaces in enum

        Laptop lap = Laptop.Macbook;

        switch (lap) {
            case Dell -> System.out.println("Switch Dell: "+Laptop.Dell.getPrice());
            case Macbook -> System.out.println("Switch Macbook: "+Laptop.Macbook.getPrice());
            default -> throw new AssertionError();
        }

        lap.setPrice(2300);

        lap.getClass();

    }
}
