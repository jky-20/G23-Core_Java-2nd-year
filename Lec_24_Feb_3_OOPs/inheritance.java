package Lec_24_Feb_3_OOPs;

class employee{
    String name;
    int salary;

    employee(String name, int salary){
        System.out.println("Employee");
    }

    void print(){
        System.out.println("Base class");
    }
}

class engineer extends employee{
    int bonus;
    
    engineer(){
        super("jai", 10000);
        System.out.println("Engineer");

        super.salary = 20000;
    }

    void print(){
        super.print();  // calling parent class methods
        System.out.println("Child Class");
    }
}

class software_developer extends engineer{

    String techSkills;
}

class quality_engineer extends engineer{

    String techtools;
}

public class inheritance {
    public static void main(String[] args) {
        
        employee emp2 = new engineer();
        // emp2.bonus;     // can't access

        // engineer e2 = new employee();   // invalid syntax

        engineer e1 = new engineer();
    }
}
