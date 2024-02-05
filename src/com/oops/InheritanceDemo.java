package com.oops;

class Father{
    int cash=10000;

}
class Son extends  Father{


}
public class InheritanceDemo {
    public static void main(String[] args) {
        Son s= new Son();
        System.out.println(s.cash);

    }
}
