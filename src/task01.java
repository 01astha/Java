
interface control {

    void speed();
}

abstract class Vehicle implements control{

    String type;
    public Vehicle(String typ)
    {
        this.type = typ;
    }
    abstract void info();
}

class Road extends Vehicle{

    public Road()
    {
        super("Road");
    }

    static String owner_name, model_no;

    public void info()
    {
        owner_name = "Ben";
        model_no = "6tJ4690";
    }
    static int sp;
    public void speed()
    {
        sp = 80;
    }
}

class Air extends Vehicle{

    public Air()
    {
        super("Air");
    }

    static String owner_name, model_no;

    public void info()
    {
        owner_name = "Jack";
        model_no = "4t678";
    }
    static int sp;
    public void speed()
    {
        sp =1080;
    }
}

class two_wheeler extends Road{

    void display(){
        super.info();
        System.out.println("Type of the Vehicle: "+super.type);
        System.out.println("Owner of the Vehicle: "+super.owner_name);
        System.out.println("Model number of the vehicle: "+super.model_no);
        super.speed();
        System.out.println("Speed of the Vehicle is: "+sp);
    }
}

class air_plane extends Air{

    void display(){
        super.info();
        System.out.println("Type of the Vehicle: "+super.type);
        System.out.println("Owner of the Vehicle: "+super.owner_name);
        System.out.println("Model number of the Vehicle: "+super.model_no);
        super.speed();
        System.out.println("Speed of the Vehicle is: "+sp);
    }
}

public class task01 {

    public static void main(String[] args) {

        two_wheeler obj = new two_wheeler();
        obj.display();
        air_plane air = new air_plane();
        air.display();
        
    }
}
