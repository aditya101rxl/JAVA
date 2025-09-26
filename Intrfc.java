/* 

    Interfaces in JAVA:
    
    Variable:
        We can't create a normal variables in interface,
        by default every variables are static or final

    Methods:
        Can have abstract methods(methods without defination)
        and normal methods also with default defination.

    class:
        If a class implementing an interface and doesn't implement any abstract method
        then class become asbtract class.

    note interface can extends other interface as well


*/


interface X {
    void show();
}

interface Y extends X {
    void run();
}

interface Z {
    void move();
}

class A implements Y, Z {
    @Override
    public void show() {
        System.out.println("In show....");
    }
    @Override
    public void run() {
        System.out.println("RUnning......");
    }
    @Override
    public void move() {
        System.out.println("Moving..");
    }
}

public class Intrfc {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj.run();
        obj.move();

        Y obj2 = new A();
        obj2.run();
    }
}
