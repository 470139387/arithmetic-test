package com.arithmetic;

import java.util.Stack;

public class TwoStacksQueue {
    
    private Stack<Integer> stackPush;
    
    private Stack<Integer> stackPop;
    
    
    public TwoStacksQueue(){
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }
    
    public void add(int pushInt){
        this.stackPush.push(pushInt);
    }
    
    public int pop(){
        if(this.stackPop.empty() && this.stackPush.empty()){
            throw new RuntimeException("Queue is empty.");
        }else if(this.stackPop.empty()){
            while(!this.stackPush.empty()){
                this.stackPop.push(this.stackPush.pop());
            }
        }
        return this.stackPop.pop();
    }
    
    public int peek(){
        if(this.stackPop.empty() && this.stackPush.empty()){
            throw new RuntimeException("Queue is empty.");
        }else if(this.stackPop.empty()){
            while(!this.stackPush.empty()){
                this.stackPop.push(this.stackPush.pop());
            }
        }
        return this.stackPop.peek();
    }
    
}
