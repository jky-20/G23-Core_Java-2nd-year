package Lec_58_April_30_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{

    private static final long serialVersionUID = 3L;    // Optional (for good practice)
    String name;
    transient int roll;
    public Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
}
public class serialization_deserialization {
    public static void main(String[] args) {
        
        Student s1 = new Student("Jai", 12345);
        try {
            // Object serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lec_58_April_30_Serialization\\example.ser"));
            oos.writeObject(s1);

            // desrialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lec_58_April_30_Serialization\\\\example.ser"));
            Student s2 = (Student)ois.readObject();
            System.out.println(s2.name);
            System.out.println(s2.roll);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
