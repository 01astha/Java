
interface control {

    void speed(int a);
}

abstract class Vehicle implements control{

    String type;
    public Vehicle(String typ)
    {
        type = typ;
    }
    abstract void info(String a, String b);
}

class Road extends Vehicle{

    public Road()
    {
        super("Road");
    }

    String owner_name, model_no;

    public void info(String owner_name, String model_no)
    {
        this.owner_name = owner_name;
        this.model_no = model_no;
    }
    int speed;
    public void speed(int speed)
    {
        this.speed = speed;
    }
}

class Air extends Vehicle{

    public Air()
    {
        super("Air");
    }

    String owner_name, model_no;

    public void info(String owner_name, String model_no)
    {
        this.owner_name = owner_name;
        this.model_no = model_no;
    }
    int speed;
    public void speed(int speed)
    {
        this.speed = speed;
    }
}

class two_wheeler extends Road{

    public void info()
    {
        System.out.println("Type of the Vehicle: "+super.type);
        System.out.println("Owner of the Vehicle: "+super.owner_name);
        System.out.println("Model number of the vehicle: "+super.model_no);
    }
    public void speed()
    {
        System.out.println("Speed of the Vehicle is: "+super.speed);
    }
}

class air_plane extends Air{

    public void info()
    {
        System.out.println("Type of the Vehicle: "+super.type);
        System.out.println("Owner of the Vehicle: "+super.owner_name);
        System.out.println("Model number of the vehicle: "+super.model_no);
    }
    public void speed()
    {
        System.out.println("Speed of the Vehicle is: "+super.speed);
    }
}

public class task01 {

    public static void main(String[] args) {

        two_wheeler obj1 = new two_wheeler();
        obj1.info("Ben","6t5ty");
        obj1.info();
        System.out.println("--------------------------------------");
        obj1.info("Jack","8t992");
        obj1.info();
        System.out.println("--------------------------------------");
        air_plane air = new air_plane();
        air.info("Henry","Ryt123456");
        air.info();
        System.out.println("--------------------------------------");
        air.info("Fudge","Lft098764");
        air.info();
    }
}
