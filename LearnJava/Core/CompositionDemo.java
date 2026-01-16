package LearnJava.Core;

class Parent{
    void methodA(){
        System.out.println("Method A");
    }
    void methodB(){
        System.out.println("Method B");
    }
}

class Child1{
    private Parent p = new Parent();

    void meathodA(){
        p.methodA();
    }
}

class Child2 extends Parent{

    @Override
    void methodA() {
        super.methodA();
    }

    @Override
    void methodB() {
        super.methodB();
    }
}
public class CompositionDemo {
    static void main() {
        Child1 child1 = new Child1();

        child1.meathodA();
    }
}
