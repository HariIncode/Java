package DSA;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearningStack {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
//        Deque<Integer> stack = new ArrayDeque<>();

        System.out.println("Empty ? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Peek " + stack.peek());
//        System.out.println("Full ? " + stack.isFull());
        System.out.println("Size ? " + stack.size());
        System.out.println("Pop " + stack.pop());
        System.out.println("Peek " + stack.peek());
//        System.out.println("Full ? " + stack.isFull());
        System.out.println("Size ? " + stack.size());
        System.out.println("Empty ? " + stack.isEmpty());

    }
}

class CustomStack{
    int[] stack;
    int maxSize;
    int top;

    CustomStack(int size){
        this.maxSize = size;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    void push(int value){
        if(isFull()){
            System.out.println("Stack is Full Cannot push " + value);
            return;
        }
        stack[++top] = value;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Cannot POP a Empty Stack");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if (isEmpty()){
            System.out.println("Empty Stack !!!");
            return -1;
        }
        return stack[top];
    }

    boolean isFull(){
        return top == maxSize - 1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    int size(){
        return top + 1;
    }
}