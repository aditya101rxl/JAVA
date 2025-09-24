/*
 *  Inheritance in JAVA:
 *      Sinlge level inheritance A -> B
 *      Multi level inheritance A -> B -> C
 *      Multiple inheritance is not allowed in java, as it doesn;t have any virtuial class/method concepts
 *      So we carete interface and mutiple interface can be inheritad using implements keyword
 */


class Calc {
    public int add(int x, int y) {
        return x+y;
    }
    public int sub(int x, int y) {
        return x-y;
    }
}

class AdvCalc extends Calc {
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

        AdvCalc c2 = new AdvCalc();
        System.out.println(c2.add(2, 3));
        System.out.println(c2.mul(2, 3));
        System.out.println(c2.div(8, 2));

        // give error: Calc can't be converted to AdvCalc
        // AdvCalc c3 = new Calc();
        // System.out.println(c3.add(3, 4));
    }
}
