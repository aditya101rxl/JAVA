/* 

    Inner classes in java:

        A class have one or many inner class.
        To create obj of inner class, we need obj of outer class.

        If we want to create obj of inner class without obj of outer class make inner class a static class
        Note: Outer class can't be static in any case.

        Tp access inner class, use syntex Outer.Inner

    Anonymous inner class

        In this don't need to create new class for any methods defination,
        we can extend the base to override the methods during obj creation.

        Note: this helps use to create obj of an abstract class as well.

*/

class A {
    public void show() {
        System.out.println("In outer class A");
    }

    static class B {
        public void show() {
            System.out.println("In inner class B");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        // if inner class is non-static
        // A.B obj2 = obj1.new B();
        // obj2.show();

        // if we make inner class static
        A.B obj3 = new A.B();
        obj3.show();

        // anonymous class
        A obj4 = new A(){
            @Override
            public void show() {
                System.out.println("In new show");
            }
        };

        obj4.show();
    }
}
