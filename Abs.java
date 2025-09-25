

/* 

    Abstraction in JAVA:

        Abstract methods decleared in only abstract classes
        So when we make method abstract we've to make class abstract
        and we can't create obj of an abstract class
        Vice-versa is not mendatory, like if we can class abstract it's mendatory make one more methods abstract
        abstract class with no abstract method is valid

        Hence, abstract class are only for inheritance and the class ingeriting the abstract class is called concrete class.


*/

abstract class Car {
    public abstract void start();

    public void drive() {
        System.out.println("Driving...");
    }
}

class BMW extends Car {
    @Override
    public void start() {
        System.out.println("Push button start...");
    }
}

class Maruti extends Car {
    @Override
    public void start() {
        System.out.println("Key start...");
    }
}

public class Abs {
    public static void main(String[] args) {
        Car bmw = new BMW();
        bmw.start();
        bmw.drive();

        Car suzuki = new Maruti();
        suzuki.start();
        suzuki.drive();
    }
}
