package org.fenixsoft.classloading;

public class SuperClass {
    
    static {
        System.out.println("SuperClass init!");
    }
    
    public static int value = 123;
    
    public static final int num = 456;
    
    public static void sayHello(){
        System.out.println("Hello !");
    }
}
