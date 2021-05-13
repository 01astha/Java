//One class serves as a superclass for more than on subclass.
import java.util.Scanner;

class X {

    Scanner input = new Scanner(System.in);
    int a, b;
    public void get_value()
    {
        System.out.println("Enter the value of a and b:");
        a = input.nextInt();
        b = input.nextInt();
    }
}

class Y extends X {

    public void sum()
    {
        System.out.println("Sum = "+ (a+b));
    }
}

class Z extends X {

    public void subtract()
    {
        System.out.println("Subtraction = "+ (a-b));
    }
}

class Q extends X {

    public void product()
    {
        System.out.println("Product = "+ (a*b));
    }
}

public class JavaHierarchicalInheritance {

    public static void main(String[] args)
    {
        Y sub_Y = new Y();
        sub_Y.get_value();
        sub_Y.sum();

        Z sub_Z = new Z();
        sub_Z.get_value();
        sub_Z.subtract();

        Q sub_Q = new Q();
        sub_Q.get_value();
        sub_Q.product();
    }
}
