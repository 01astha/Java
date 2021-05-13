// A derived class will be inheriting a base class and as well as the derived class
// also act as the base class to other class.

class A {
    public void print_A()
    {
        System.out.println("I am A.");
    }
}

class B extends A {
    public void print_B()
    {
        System.out.println("I am B.");
    }
}

class C extends B {
    public void print_C()
    {
        System.out.println("I am C.");
    }
}

public class JavaMultilevelInheritance {

    public static void main(String[] args)
    {
        C subclass_C = new C();
        subclass_C.print_A();
        subclass_C.print_B();
        subclass_C.print_C();

    }
}
