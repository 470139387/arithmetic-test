package org.fenixsoft.classloading;


public class Test {
    /*//public static int i = 123;
    static {
        i = 0;////给变量赋值可以正常编译通过
        System.out.println(i);//这句编译器会提示"非法向前引用"
    }
    public static int i = 123;
    
    public static void main(String[] args ) {
        
    }*/
    
    
    /*public static void main(String[]args){
        Runnable script=new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread()+"start");
                DeadLoopClass dlc=new DeadLoopClass();
                System.out.println(Thread.currentThread()+"run over");
            } }
        ;
        Thread thread1=new Thread(script);
        Thread thread2=new Thread(script);
        thread1.start();
        thread2.start();
    }*/
    /*public static void main(String[] args ) {
        
        User user = new User();
        user.setAge(15);
        user.setUsername("xiaoqiang");
        
        System.out.println(user);
        System.out.println("按时发生");
    }*/
    /* public static void main(String[] args ) {
        //byte[] placeholder=new byte[64*1024*1024];
        
        SubClass sc = new SubClass();
        
        System.gc();
    }*/
    
    public static void main(String[] args ) {
        //运行程序会出现java.lang.NegativeArraySizeException异常.运行时异常
        int [][][] array = new int[1][0][-1];
        
        
    }
    
}
