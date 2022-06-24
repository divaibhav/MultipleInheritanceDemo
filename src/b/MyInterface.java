package b;
public interface MyInterface {
    // everything in interface is by default public
    //constant, by default are public static final
    // abstract method, by default are public
    // default method, by default public
    //static method, by default public, but can create private

    // all these methods are public?
   int number = 100;
   //void display();
   static void test(){
       System.out.println("hello");
   }
   public default void display1(){
       System.out.println("My default method");
   }
}
