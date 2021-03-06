package com.arithmetic;

import java.util.Stack;

public class MyStack1 {
    
    private Stack<Integer> stackData;
    
    //记录每一步的最小值阿是飞洒22222阿是飞洒
    private Stack<Integer> stackMin;
    
    public MyStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }
    
    
    public void push(int newNum){
        if(this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if(newNum < getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }
    
    public int pop(){
        if(this.stackData.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        int value = this.stackData.pop();
        if(value == this.getmin()){
            this.stackMin.pop();
        }
        return value;
    }
    
    public int getmin(){
        if(this.stackMin.isEmpty()){
            throw new RuntimeException("Your stack is empty.");
        }
        return this.stackMin.peek();
    }
    
}
