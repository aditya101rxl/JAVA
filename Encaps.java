/*

Naming convension in java:
    Camel casing:
        class, interface - Calc, Runnable
        varibale, methods - marks, isValid()
        constants - PIE



Encapsulation in JAVA:

    By deafult all vaiable and methods are public in java

    Note: Every methods have its own stack memory where they store their variables

    'this' is a keyword which represent the current obj

    Constructor:
        Doesn't return any value

        - default constructor, accepting 0 argument
        - parameterised constructor, accept some arguments



Anonymous objs in JAVA:

    If we create any obj but didn't assign it any refrence varibale
    We can't use those anonymous objs, as they don't have reference to use.
 */



class Human {
    String name;     // by default it is public
    private int age;

    public int getAge() {
        return age;
    }
    public void setAge(int x) {
        this.age = x;
    }
}


public class Encaps {
    public static void main(String args[]) {
        Human h = new Human();

        h.name = "aditya";
        // we can't access private variable outside the class, so we use getter and setter methods for that
        // h.age = 12;
        h.setAge(123);
        System.out.println(h.name + " " + h.getAge());
    }
}