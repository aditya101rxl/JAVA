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

    Types of interfaces

        1. Normal interface
            Have two or more methods

        2. functional/SAM interface
            Have only one method

        3. Marker interface
            Mave no method
            Used for granting permission to any class.

            A marker interface in Java is an interface that contains no methods or constants. 
            Its sole purpose is to "mark" or "tag" a class, providing metadata about it at runtime. 
            This allows the Java Virtual Machine (JVM), libraries, or frameworks to recognize and 
            treat objects of that class in a specific way, even though no explicit methods are enforced by 
            the interface itself. 


            eg., Serializable (from java.io): Indicates that 
            objects of a class can be converted into a byte stream (serialized) and later reconstructed (deserialized).


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
