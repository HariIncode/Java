package OOPS.Polymorphism;

public class ObjectPrint {

    int num;

    ObjectPrint(int num){
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(10);

        System.out.println(obj);
    }
}
