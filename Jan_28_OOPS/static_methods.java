package Jan_28_OOPS;
// import Jan_27_OOPS.example_class;


class car{
    String brand;
    String color;
    int speed;

    car(){      // user made default consrtuctor
        brand = "";
        color = "Black";
        speed = 60;
    }

    car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }

    static void display(){
        System.out.println("A static method");

        // System.out.println(brand); // gives error can't access directly

        // how to acces non static data members
        car temp = new car();
        temp.brand = "TATA";
    }
}

public class static_methods {
    public static void main(String[] args) {
        
        car.display();

        car car1 = new car("Fortuner", "White", 120);
        car1.print();
    }
}
