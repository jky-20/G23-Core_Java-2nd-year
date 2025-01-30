package Jan_30_OOPs;

class employee{
    String name;
    int salary;

    employee(){
        System.out.println("Employee");
    }
}

class engineer extends employee{
    int bonus;
    
    engineer(){
        System.out.println("Engineer");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        engineer e1 = new engineer();
        e1.name = "Jai"; // accessing parent class members

        employee emp1 = new employee();

        // instanceof checks IS-A relationship
        System.out.println(emp1 instanceof employee);
        System.out.println(e1 instanceof engineer);
        System.out.println(e1 instanceof employee);
        System.out.println(emp1 instanceof engineer);

        employee emp2 = new engineer();
        // engineer e2 = new employee();   // invalid syntax
    }
}
