package Lec_34_Feb_21_OOPs;
import java.util.ArrayList;
import java.util.Collections;

class G_23 implements Comparable<G_23>{
    String name;
    int marks;
    G_23(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
    @Override
    public int compareTo(G_23 obj2){
        return Integer.compare(obj2.marks, this.marks);
    }
    @Override 
    public String toString(){
        return ("name : " + name + " || marks : " + marks);
    }
}

public class comparable {
    public static void main(String[] args) {
        
        ArrayList<G_23> arr = new ArrayList<>();
        arr.add(new G_23("Jai", 62));
        arr.add(new G_23("Satyam", 72));

        Collections.sort(arr);
        for(G_23 s : arr){
            System.out.println(s);
        }
    }
}
