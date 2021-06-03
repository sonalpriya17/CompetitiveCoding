package Inheritance;

public class C {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = (B) new A();
        A a2 = new B();

        a1.methodA1();
        a2.methodA2();
        b1.methodA1();
        b1.methodA2();
        b1.methodB1();
        b1.methodB2();

        a2.methodA2();
        a2.methodA1();


    }
}
