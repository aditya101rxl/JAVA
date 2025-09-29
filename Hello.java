/*
note: Java is platform independent.
java code (.java) -----> compiler (javac) -----> Byte code (.class) -----> JVM -----> OS -----> Hardware
JVM alway look for main method to start

to compile code using (javac Hello.java)
to run code, compile first, then run (java Hello), byte code which has extension .class

Other way (not prefered): java Hello.java (it will compile and run the code)

Note: 

JVM (java virtual machine) comes under JRE (java runtime env) which has all java libraries 
and JRE comes under JDK (java Develepment kit)

------------------------------------------------------------------------------------------
                                Variables in JAVA

Note: Java is strongly tight lang (so one type can't assign to other types)
        <data_type> <variable_name> = <variable_value>;

    Data types in java: (primitive & non-primitive)
    1. Primitive:
        a. integer (byte (1 byte), short (2 bytes), int (4 bytes), long (8 bytes)) [1 bytes = 8 bits]
        b. float (double (8 bytes), float (4 bytes)), default is double [for float, 
                explicity write f in end of variable value, like: float num = 5.6f;]
        c. character (char (2 bytes)) [like: char ch = 'a';]
        d. boolean (alway true or false, 0 & 1 not work for java) [bool b = true;]
        e. compilation error occurs, if you don't initialise the variables.

        Literals:
            bits-> int x = 0b101; // x = 5
            hexa-> int x = 0x7E // x = 127
            int-> long x = 10_00_00_000; // x = 100000000;
            double x = 56; // x = 56.0;
            double x = 12e10; x = 120000000000.0;
            boolean b = 1; //error, only true/false accepted
            char c = 'a';

        Type conversion & casting:
            Note: a small value (less bytes) can only be assign to large value;
            like: if we want to assign int to byte, is give error. To do so, we must first caste it to byte.
            int a = 27;
            byte b = 100;
            a = b; // work (this is called conversion)
            b = a; // gives error
            b = (byte)a; // here we type caste a to byte and then assigning it to byte. (this is called casting).

        Type promotion in java:
            byte a = 10;
            byte b = 30;
            int res = a * b; // it auto promoted to int, because it is out of bound;

        Arithmetic operators
            +, -, *, /, %

        Relational operators (alway give boolean value)
            <, >, ==, !=, <=, >= 

        Logical operators
            AND (&&), OR (||), NOT (!)

------------------------------------------------------------------------------------------
                        Conditional Statements

To execute some part on a certain conditions
like if/else/else if

    if/else:
        if (condition) {

        } else if (condition2) {

        } else {

        }

    Ternary operator:
        ?:
        int x = 7;
        int result = x > 10 ? 1 : 0;

    Switch Statement:
        It has only one statement per case with arrow function but can have multiple with break; statement.
        based on the value, it execute the special case:
        Note: once it matches a case, by default it execute all cases after the matched case
        To explicitly break, use break; word to exit the switch block
        Note: before java5, only int was support in switch, but from java5 string is also supported
        from java12, we can use arrow to avoid writing break, and we can also use switch case to return value
        see the example below.

        Note: we can have same value in 2 different case. (error: duplicate case label)


------------------------------------------------------------------------------------------
                                Loops in Java
Reiterate the same block of statements multiple times
    Types of loops in java (for, while, do while)
*/


class Hello {
    public static void main(String[] args) {

        // hello world
        System.out.println("Hello world");

        // variables

        int num = 7;
        byte by = 127;
        short sh = 578;
        long l = 786234l;

        float f = 5.8f;
        double d = 5.8;

        char c = 'a';

        boolean b = true;


        // switch case

        int n = 1;
        switch(n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                System.out.println("day1...");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid value");
        }

        String day = switch(n) {
            case 1: yield "Sun";
            case 2: yield "Mon";
            case 3: yield "Tue";
            case 4: yield "Wed";
            case 5: yield "Thr";
            case 6: yield "Fri";
            case 7: yield "Sat";
            default: yield "Invalid";
        };

        // additional switch support from java12

        // String day = "Mon";
        
        // switch(day) {
        //     case "Sun", "Sat" -> System.out.println("Weekend");
        //     case "Mon", "Tue", "Wed", "Thr", "Fri" -> System.out.println("Office");
        //     default -> System.out.println("Invalid input");
        // }

        String res = switch(day) {
            case "Sun", "Sat" -> "Weekend";
            case "Mon", "Tue", "Wed", "Thr", "Fri" -> "Office";
            default -> "Invalid input";
        };

        System.out.println(res);




    }
}