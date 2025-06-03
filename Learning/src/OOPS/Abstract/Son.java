package OOPS.Abstract;

public class Son extends Parent{

    @Override
    void career(String name){
        System.out.println("Engineer");
    }

    @Override
    void partner(String name, int age){
        System.out.println("I Love "+ name + " " + age);
    }
}
