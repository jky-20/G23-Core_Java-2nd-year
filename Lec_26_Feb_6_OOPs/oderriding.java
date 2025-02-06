package Lec_26_Feb_6_OOPs;

class motor_vehicle{
    motor_vehicle(){
        System.out.println("motor vehicle constructor");
    }
    void start(){
        System.out.println("Switch on engine");
    }
    motor_vehicle get_vehicle(){
        System.out.println("Motor Vehicle Class");
        return new motor_vehicle();
    }

    private void private_func(){
        System.out.println("private function");
    }
    static void static_func(){
        System.out.println("static function");
    }
    final void final_func(){
        System.out.println("final function");
    }
    protected void protected_func(){
        System.out.println("Protected scope function");
    }
}

class car extends motor_vehicle{
    // motor_vehicle(){    // can't override constructors
    //     System.out.println("motor vehicle constructor in car");
    // }
    void start(){
        System.out.println("Starts by Key");
    }
    // motor_vehicle get_vehicle(){
    //     System.out.println("Car class");
    //     return new motor_vehicle();
    // }
    car get_vehicle(){
        System.out.println("Car class");
        return new car();
    }
    void private_func(){        // own class method , not inherited
        System.out.println("private function");
    }
    // void static_func(){     // can't override static methods
    //     System.out.println("static function");
    // }
    static void static_func(){     // Method hiding, not override
        System.out.println("static function");
    }
    // void final_func(){      // can't override final methods
    //     System.out.println("final function");
    // }
}

class bike extends motor_vehicle{

    // @Override anotation
    @Override
    void start(){
        System.out.println("Starts by kick");
    }
    
    // private void protected_func() {     // can't limit the scope
    //     System.out.println("Scope protected");
    // }
}

public class oderriding {
    public static void main(String[] args) {
        
    }
}
