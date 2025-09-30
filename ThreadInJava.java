

/*

    Thread in JAVA.

        Every thread class should have run method to start the thread
        To make class a therad, extends it with Thread class.

        thread priority goes from 1-10 (most-least)
        this priority only comes in picture when their are multiple similar thread
        come at schedular for execution, then scheludler check for pririty.

        We can use .join() method to wait for thread to complete the execution
        before we the main execution complete.


        Thread class implements Runnable interface.
        Whenever we need to extends some other class, we can't use Thread class
        at the same time as java doesn't support multi-inheritance.

        So we implements Runnable interface to implement the thread


    Race condition
        Multiple Thread may impact same obj and change those values.

        Thread safe
            When multiple thread work with same obj, then they may modify at same time
            to prevent multiple thread have access to same obj at same time
            use syschronized notation in function

    Thread state

        New -> Runnable     <-
                    |               Waiting
                Running     ->  
                    |
                    Dead

*/

// class A extends Thread{
//     public void run() {
//         for(int i=0; i<10; ++i) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

// class B extends Thread{
//     public void run() {
//         for(int i=0; i<10; ++i) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// }

class A implements Runnable{
    public void run() {
        for(int i=0; i<10; ++i) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class B implements Runnable{
    public void run() {
        for(int i=0; i<10; ++i) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}

class Counter {
    int count = 0;
    public synchronized void increment() {
        ++count;
    }
}

public class ThreadInJava {
    public static void main(String[] args) {
        // A obj1 = new A();
        // B obj2 = new B();

        // // obj1.show();
        // // obj2.show();
        // // obj1.setPriority(Thread.MAX_PRIORITY);
        // // System.out.println(obj1.getPriority());

        // // obj1.start();
        // // obj2.start();

        // // obj1.join();
        // // obj2.join();

        // // start will not work, bcoz it's method of Thread.

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();


        // // we can do this using anonymous class as well.

        // Runnable obj3 = new Runnable() {
        //     public void run() {
        //         for(int i=0; i<10; ++i) {
        //             System.out.println("Aditya");
        //             try{
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) {e.printStackTrace();}
        //         }
        //     }
        // };

        // Thread t3 = new Thread(obj3);
        // t3.start();
        

        // // we can do the above using lambda expression as well

        // Runnable obj4 = () -> {
        //     for(int i=0; i<10; ++i) {
        //         System.out.println("Gupta");
        //         try{
        //             Thread.sleep(10);
        //         } catch (InterruptedException e) {e.printStackTrace();}
        //     }
        // };

        // Thread t4 = new Thread(obj4);
        // t4.start();


        Counter c = new Counter();
        Runnable obj5 = () -> {
            for(int i=0; i<10000; ++i) c.increment();
        };

        Runnable obj6 = () -> {
            for(int i=0; i<10000; ++i) c.increment();
        };

        Thread t5 = new Thread(obj5);
        Thread t6 = new Thread(obj6);

        t5.start();
        t6.start();

        // here every time we execute code, we may not get 2000 increments
        // bcoz, before 2 thred complete the execution main thread teminate
        // to prevent this, use .join() methods to wait for threads
        System.out.println(c.count);

        try{
            t5.join();
            t6.join();
        } catch (InterruptedException e) {e.printStackTrace();}

        // still we may not get exact value, as both thread incrementing
        // same counter, so it may happen that at some time, both counter
        // increment at same time. To prevent that use synchronized keyword in method.
        System.out.println(c.count);

    }
}
