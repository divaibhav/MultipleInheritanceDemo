package b;

public  interface DemoIntreface  {
    default void display1(){
        System.out.println("demo interface");
    }
    default void myTest(){
        System.out.println("my test");
    }
}
