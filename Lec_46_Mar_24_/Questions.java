package Lec_46_Mar_24_;

class parent{
    void display(){
        System.out.println("Parent");
    }
}
class child1 extends parent{
    void display(){
        System.out.println("Child 1");
    }
}
class child2 extends parent{
    void display(){
        System.out.println("Child 2");
    }
}

public class Questions {
    public static void main(String[] args) {
        parent c1 = new child1();
        c1.display();
    }
}
