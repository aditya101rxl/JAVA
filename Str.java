/*
    String in Java is immutable (unchangable)
    Meaning they can't be changed once created,
    whenever we try to change a string in java, its create a new string in Constant
    string pool (CSP- a special memory area in the JVM.) in java
    if that new string doesn't exists else it simply assign to already created string.
    eg.,
        String s1 = "aditya";
        String s2 = "adity";
        s2 = s2+"a";
        String s3 = "aditya";

        
    Now, you're concatenating "a" to the string referenced by s2, which was "adity".
    This creates a new string object: "aditya".
    ⚠️ Even though "aditya" already exists in the string pool, s2 + "a" creates a new object in the heap,
    not in the pool, because the result of + at runtime is not interned automatically.
    So now, s2 refers to a new object "aditya" in the heap, while s1 still refers to the pooled string "aditya".

    But s3 == s1 as they are same so create only once in the string pool.


    StringBuffer and StringBuilder are mutables string in java.
    We can append or modify the mutable string at place, not extra values or garbage value left out after every modification.

    Note: StringBuilder is thread safe while StringBuffer is not.
 */


/*

    Static in JAVA

    variables inside class are called instance variables
    variables inside a functions are local variables

    static variables:
    - are shared by every variable, and called class variables
    We can directly access the class variables with any objs.

    static methods:
    - only static variables are accessed inside static class
    - We need to pass obj reference to access non-static variables.

    static block:
    - it execute only once when class is loaded.
    - Java first load the class and then initialise the obj.
    - class loaded inside class loader once at first time we initialise class.
    - We can also manuallly load class in class loader using Class obj
        - Class.forName("className"); // this may through exception - classNotFound



 */


class Mobile {
    String name = "S24";     // instance variable
    int price = 5000000;     // instance variable
    static String brand = "SAMSUNG"; // class variable

    // no need to assign static variables everytime we create an obj.
    public Mobile(String n, int p) {
        this.name = n;
        this.price = p;
        System.out.println("Inside constructor");
    }

    // assign onle once, when we load the class
    static {
        brand = "SAMSUNG";
        System.out.println("Inside static block");
    }
    
    public void show() {
        int count = 0;     // local variable
        System.out.println(brand + " " + name + " " + price);
    }

    public static void showStatic(Mobile obj) {
        // we can't access non-static variable without reference.
        System.out.println(brand + " " + obj.name + " " + obj.price);
    }
}


public class Str {
    public static void main(String args[]) throws ClassNotFoundException {

        String s1 = "aditya";
        String s2 = "adity";
        String s3 = "aditya";
        System.out.println(s1);
        s2 = s2+"a";
        System.out.println(s1==s2);
        System.out.println(s2);
        System.out.println(s1==s3);


        StringBuffer sb = new StringBuffer("aditya");
        System.out.println(sb.capacity());               // string len + 16 bits extra for str modification.

        String s = sb.toString();
        System.out.println(s);
        System.out.println(s1==s);

        System.out.println(sb.append(" Java"));



        Mobile m = new Mobile("S24", 50000);

        m.show();
        System.out.println(Mobile.brand);

        Mobile m2 = new Mobile("S25", 700000);

        // m2.show();
        Mobile.showStatic(m2);

        // load class only, if class already loaded it'll not load again.
        // if we comment above class initiallisation, this method call will load class,
        // else it'll skip class loading agian.
        // and this will invoke static block execution.
        Class.forName("Mobile");

    }
}