/*

    Exception handling in JAVA.

        types of exception in java

            1. Compilation error
            
            2. Runtime error

                error occurs during running of application, so we need to handle such error
                so that the code didn't break, and other task contunie their jobs.

            3. Logical error


    Exception Hierarchy


                            objects (class)
                                |
                            Throwable (class)
                                |
                 ------------------------------------------------------------
                |                                                           |
              Error                                                     Exceptions
                |                                                           |
        --------------------------------.....             --------------------------------------------------...
        |               |           |                     |                     |               |
    Memory error    IO Error    Hardware    ...         Runtime exception   SQL Exception   IO Exception    ...
                                                          |
                                                          | - ArithmeticException
                                                          | - IndexOutOfBoundException
                                                          | - NullPointerException
                                                          | ...
                                                        
        Note: All the runtime exception are called unchecked exception, meaning not forced to handle
        While all other exceptions are checked exception, meaning it is forced to handle.

        throw keyword is used to create new exception.
        throws kryword is used with functions to throw the exception from where this function is called

*/

class A {
    public void show() throws ArithmeticException {
        int res = 10/0;
        System.out.println(res);
    }
}

public class Excep {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 10;
        int res = 0;
        try {
            res = j/i;
            if (res == 0)
                throw new ArithmeticException("Res couldn't be 0.");
        } catch (Exception e) {
            System.out.println("Some error occurs..."+e);
        }
        System.out.println(res);

        System.out.println("Exception handling in JAVA.");



        // accpting error throws by show method of class A
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("catching thrown error from a method.");
        }
    }
}
