package org.fenixsoft.classloading;

public class NotInitialization {
    
    /*static {
        System.out.println("NotInitialization!!!");
    }*/
    
    public static void main(String[] args ) {
        //主动引用
        //1,使用new关键字实例化对象
        //new SubClass();
        //2,读取类的静态成员变量
        //System.out.println(SuperClass.value);
        //3,设置类的静态成员变量
        //SuperClass.value = 333;
        //4,调用类的静态方法
        //SuperClass.sayHello();
        //5,main方法当前的类
        
        //被动引用
        //1,通过数组定义来引用类,不会触发此类的初始化
        //SuperClass[] superClass = new SuperClass[10];
        //2,常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
        //System.out.println(SuperClass.num);
        //3,通过子类引用父类的静态字段，不会导致子类初始化
        //System.out.println(SubClass.value);
        
        Integer a = 1,b = 1;
        
        
        
        
        System.err.println(a==b);
        
    }
}
