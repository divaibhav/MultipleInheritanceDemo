package c;

import b.DemoIntreface;
import b.MyInterface;

public class MyDerived implements MyInterface, DemoIntreface {
    // problem with multiple inheritance
    // is ambiguity of resolving methods, with same
    public static void main(String[] args) {
       MyDerived myDerived = new MyDerived();
       myDerived.display1();
       //parent reference can contain object of child
        DemoIntreface demoIntreface = new MyDerived();
        MyInterface myInterface = new MyDerived();
        myInterface.display1();

    }
     public void display1(){
         System.out.println("child");
               //interface name . super. default method name
         MyInterface.super.display1();
         DemoIntreface.super.display1();
         MyInterface.test();


    }

}
