/*
Inheritance in JAVA:
    Sinlge level inheritance A -> B
    Multi level inheritance A -> B -> C
    Multiple inheritance is not allowed in java,
    It create an ambiguity, which is resolved in C++ using virtual class and methods
    So we carete interface and mutiple interface can be inheritad using implements keyword


    this and super keyword

    When we create an obj of a sub class, it call constructor of both parent class, and grand parent class
    and so on.
    By default every construct invoke super() methods, that why all its parent default constructor called.


    Note:

        By default every class in java extends Object class in java
        in case of multi-level inheritance, only first class extends Object class.

    We can't call this() and super() in same consturctor.

        Why does Java restrict this?
        Java enforces this to guarantee proper initialization:
        Superclass must be initialized before subclass members.
        Allowing both this() and super() would make the order of initialization ambiguous or complex.
        Java chooses simplicity and clarity: only one constructor call per constructor, and it must be first.

    Methods overriding in JAVA.

 */


class Calc {
    public Calc() {
        System.out.println("in Calc");
    }
    public Calc(int x) {
        System.out.println("in Calc "+x);
    }
    public int add(int x, int y) {
        return x+y;
    }
    public int sub(int x, int y) {
        return x-y;
    }
}

class AdvCalc extends Calc {
    public AdvCalc() {
        System.out.println("IN ADV CALC");
    }
    public AdvCalc(int x) {
        this();
        // super(x);
        System.out.println("IN ADV CALC "+ x);
    }
    public int mul(int x, int y) {
        return x*y;
    }
    public int div(int x, int y) {
        return x/y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2, 3));
        System.out.println(c.sub(12, 2));

        AdvCalc c2 = new AdvCalc(3);
        System.out.println(c2.add(2, 3));
        System.out.println(c2.mul(2, 3));
        System.out.println(c2.div(8, 2));

        // give error: Calc can't be converted to AdvCalc
        // AdvCalc c3 = new Calc();
        // System.out.println(c3.add(3, 4));
    }
}
