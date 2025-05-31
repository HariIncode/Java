package OOPS.Class;

import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student(2,"Hari",97f);

        std1.show();
        std2.show();

//        Calculator cl = new Calculator();
//        cl.add(2,5);
//        System.out.println(cl.result);
//        cl.clear();
//        System.out.println(cl.result);
    }
}

class Student{
    int rollNum;
    String name;
    float marks;

    Student(){
        this(0,"No Name",0f);
    }

    Student(int rollNum, String name, float marks){
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    void show() {
        System.out.printf("%d %s %2f",rollNum,name,marks);
    }
}

class Calculator{
    int result;
    Calculator(){
        result = 0;
    }
    void add(int a, int b){
        result = a + b;
    }

    void clear(){
        result = 0;
    }
}

abstract class Hello{
    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }
}
