package Jan_27_OOPS;

class car{
    String brand;
    String color;
    int speed;

    car(){      // default consrtuctor
        brand = "";
        color = "";
        speed = 0;
    }

    car(String b, String c, int s){
        brand = b;
        color = c;
        speed = s;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }
}

public class class_and_objects {
    public static void main(String[] args) {
        
        car car1 = new car();   // creating object of class
        car1.brand = "Nexon";
        car1.color = "Black";
        car1.speed = 80;
        car1.print();

        car car2 = new car("KIA", "Grey", 100);
        car2.print();
    }
}
