package org.fenixsoft.classloading;

public class SubClass extends SuperClass{
    
    public static int num=10;
    
    static{
        System.out.println("SubClass init!");
    }
}
