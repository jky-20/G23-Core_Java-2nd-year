package Lec_22_Jan_28_OOPS;

class Car{
    private String brand;
    private String color;
    int speed;

    Car(){      // user made default consrtuctor
        brand = "";
        color = "Black";
        speed = 60;
    }

    Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    String getBrand(){
        return this.brand;
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }
}

public class encapsulation {
    public static void main(String[] args) {
        
        Car car1 = new Car("Fortuner", "White", 120);
        String brand = car1.getBrand();
        System.out.println(brand);

        car1.setColor("Black");
    }
}
