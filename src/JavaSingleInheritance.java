//Subclass inherits the features of one Superclass.
class one {

    public void one_method()
    {
        System.out.println("Method in super class.");
    }
}

class two extends one {

    public void two_method()
    {
        System.out.println("Method in sub class.");
    }
}

public class JavaSingleInheritance {

    public static void main(String[] args)
    {
        two sub_class = new two();
        sub_class.one_method();
        sub_class.two_method();
    }
}
