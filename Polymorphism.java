/*

    Polymorphism in JAVA:

        it means many behaviours
        Types:
            i. Compile time (early binding): behaviour is defined as compile time. (Methord overloading)
            ii. Run time (late binding): behaviour is define as run time. (Method overriding)

        Dynamic dispatch of methods in java.
            we can create obj of any subclass and assign it ot the parent class oobj initialisation.

        final keyword in java:
            final - variable, method, class

            final variable: is used for constants in java

            final methods: to stop methods overriding, as one can't override the final method in subclass

            final class: it stops the inheritance, final class can't inheritaed by any other class

        Downcasting and Upcasting in JAVA
            we can type caste variable to up or down data

            ✅ Key Concept: The object’s actual type doesn't change
            Even though you upcast new B() to type A, the object is still a B in memory.
            Type casting an object only changes what the variable can access — not the object itself.
            So when you do B obj3 = (B) obj2;, you're saying: "I know obj2 is actually a B, so let me treat it as one."

*/

class A {
    public void show() {
        System.out.println("In A show");
    }
    final public void creator() {
        System.out.println("In Creator of A");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("In B Show");
    }

    public void showB() {
        System.out.println("In B ShowB");
    }

    // @Override
    // public void creator() {
    //     // can't be overridden as it is final method is parent class
    // }
}

// final class C {
//     public void show() {
//         System.out.println("In final class");
//     }
// }

// class D extends C {
//     public void show() {
//         System.out.println("Inheritance not allowed with final class");
//     }
//     // class C can't be inheritaed as it is a final class
// }

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        // final
        final double PI = 3.14;
        // PI = 3.14; // not allowed, constant values can't be changed
        System.out.println("PI: "+PI);


        // type casting
        A obj2 = (A) new B(); // upcasted to A
        obj2.show();
        // obj2.showB(); // this method is undefine for type A

        B obj3 = (B) obj2;  // downcasted to B
        obj3.showB();

    }
}
