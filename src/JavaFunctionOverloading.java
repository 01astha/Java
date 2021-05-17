//Overloading allows different methods to have the same name, but different signatures where
//the signature can differ by the number of input parameters or type of input parameters or both.

public class JavaFunctionOverloading {

    public int sum(int a, int b){
        return (a+b);
    }

    public int sum(int a, int b, int c){
        return (a+b+c);
    }

    public String sum(String a, String b){
        return (a+b);
    }

    public double sum(double a, double b){
        return (a+b);
    }

    public static void main(String[] args){

        JavaFunctionOverloading obj = new JavaFunctionOverloading();
        System.out.println(obj.sum(2,3));
        System.out.println(obj.sum(2,3,4));
        System.out.println(obj.sum("Astha"," Singh"));
        System.out.println(obj.sum(2.3, 4.2));
    }
}
