// ! Abstract classes

public class AbstractClass {
    public static void main(String[] args) {

        Son sonObj = new Son(21);
        sonObj.career();
        Daughter daughterObj = new Daughter(22);
        daughterObj.career();

        sonObj.getAns();
        Parent.getName();
        // Parent mom = new Parent();
    }
}

abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void career();

    abstract void partner();

    static void getName() {
        System.out.println("My Name is Rahul");
    }

    void getAns() {
        System.out.println("Hi Rahul");
    }

}

class Son extends Parent {

    public Son(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am Going to be a Developer");
    }

    @Override
    void partner() {
        System.err.println("My Love Ema Watson");
    }
}

class Daughter extends Parent {

    int age;

    public Daughter(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void career() {
        System.out.println("I am Going to be a Coder");
    }

    @Override
    void partner() {
        System.err.println("My Love IronMan");
    }
}