package net.tricky.IQ;

/*
Can we override the static method?
--No, We can not override the static methods,
if we declare the same static method with same signature in sub-class that is called method hiding
 */
public class IQ1 {
    public void eat() {
        System.out.println("IQ1 is eatting");
    }

    public static void run() {
        System.out.println("IQ1 is running");

    }
}

class IQ2 extends IQ1 {
    public void eat() {
        System.out.println("IQ2 is eatting");
    }

    public static void run() {
        System.out.println("IQ2 is running");

    }
}

class ClientTest {
    public static void main(String[] args) {
        IQ1 i = new IQ2();

        i.eat();
        // it's called the sub-class eat methods because not static method can override

        i.run();
        // It's called the parent class run() methods
        // because static method can't override.that is called method hiding.

        IQ2.run();
        // it will call the subclass run methods.


    }
}

/*
IQ2 is eatting
IQ1 is running
IQ2 is running
 */