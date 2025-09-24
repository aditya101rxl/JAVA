/*



-----------------------------------------
|             JDK                       |
|   ------------------------------      |
|   |         JRE                 |     |
|   |    ----------------         |     |
|   |    |    JVM        |        |     |
|   |    ----------------         |     |
|   |                             |     |
|   ------------------------------      |      
|                                       |
-----------------------------------------

Methods in java:

    1. Method overloading

        add(int a, int b);
        add(int a, int b, int c);
        add(double a, int b);

        Note: parameter types and no. of params only allowed in methord overloading
        Changing return type is not conswidered as methord overloading (its give error)


Memory in java:

    1. Stack (FIFO)
        Note: every method has its own stack memory, and all local variable are part of stack memory.
        Instance variable (also called class vaiable) are part of heap memory.

    2. Heap memory
        All objects aquire heap momory, and their reference is stored in stack memory.
        It has instance variable and methods decleration only.

        heap memory address: 0x7E2
        ------------------------------------------------------------
        |   instance variable, like num of calc for obj            |
        ------------------------------------------------------------
        |   methods declerations                                   |
        |   int add(int a, int b);                                 |
        |   int add(int a, int b, int c);                          |
        |   double add(double a, double b);                        |
        ------------------------------------------------------------

Array in Java

    Default value in Java array as we initiallise is 0;

    Jagged array: Number of column is not fixed for each rows.

        int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[4];

    Drawback of array:

        We can't increase the size of array once initialised.
        Should only containes element same data types.
 
*/

class Calc{
    int num = 7;
    public int add(int a, int b) {
        return a+b;
    }
    public int add(int a, int b, int c) {
        return a + add(b, c);
    }
    public double add(double a, double b) {
        return a+b;
    }
    // gives compilation error
    // error: method add(int,int) is already defined in class Calc
    
    // public double add(int a, int b) {
    //     return a+b;
    // }

}

public class Oops {
    public static void main(String[] args) {
        // Calc obj = new Calc();
        // System.out.println(obj.add(6, 7));

        int nums[][] = new int[3][];
        nums[0] = new int[2];
        nums[1] = new int[5];

        nums[1][4]=6;

        System.out.println(nums[0][0]);
    }
}