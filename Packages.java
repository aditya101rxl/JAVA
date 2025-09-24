/*
    
    Packages in a JAVA.

        Note: every class in java belong to the packages.

        Even System class also belong to a packages name java.utils
        by default every java file import java.lang.*



    Access modifier in JAVA
                                private     protected       public      default

        same class                yes         yes             yes         yes

        Same package               no         yes             yes         yes
        subclass

        same package               no          yes            yes         yes
        non-subclass

        differenr packages         no          yes            yes         no
        subclass

        different package          no           no            yes         no
        non-subclass


        Note: if we don't specify the modifier, it considered as default


        Note: Every .java file should have only one public class named as file name
        Multiple public class in a file is restricted to prevent the ambiguity in java


 */

import tools.AdvCalculator;
// import tools.*;    // * will import all class (files not folders) at that packages,
                      // it doesn't recursivly import all class.

public class Packages {
    public static void main(String[] args) {

        AdvCalculator c = new AdvCalculator();
        int r1 = c.add(2, 3);
        int r2 = c.mod(2, 1);
        System.out.println("r1: "+r1+" r2: "+r2);
    }
}
