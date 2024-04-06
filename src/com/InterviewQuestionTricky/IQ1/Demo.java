package com.InterviewQuestionTricky.IQ1;
/*
Can we override the static method?
--No, We can not override the static methods,
if we declare the same static method with same signature in sub-class that is called method hiding
 */
 class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public static void run() {
        System.out.println("Animal is running");

    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public static void run() {
        System.out.println("Dog is running");

    }
}

class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();

        a.eat();
        // it's called the sub-class eat methods because not static method can override

        a.run();
        // It's called the parent class run() methods
        // because static method can't override.that is called method hiding.

        Dog.run();
        // it will call the subclass run methods.


    }
}

/*
Dog is eating
Animal is running
Dog is running
 */