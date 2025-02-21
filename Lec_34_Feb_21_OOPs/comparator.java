package Lec_34_Feb_21_OOPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Group_23{
    String name;
    int marks;
    Group_23(String name, int marks){
        this.marks = marks;
        this.name = name;
    }
    public String toString(){
        return ("name : " + name + " || marks : " + marks);
    }
}

class sortByMarks implements Comparator<Group_23>{
    @Override
    public int compare(Group_23 s1, Group_23 s2){
        return Integer.compare(s1.marks, s2.marks);
    }
}

class sortByName implements Comparator<Group_23>{
    @Override
    public int compare(Group_23 s1, Group_23 s2){
        return s1.name.compareTo(s2.name);
    }
}

public class comparator {
    public static void main(String[] args) {
        ArrayList<Group_23> arr = new ArrayList<>();
        arr.add(new Group_23("Jai", 82));
        arr.add(new Group_23("Satyam", 72));

        Collections.sort(arr, new sortByMarks());
        for(Group_23 s : arr){
            System.out.println(s);
        }
        System.out.println("-----------------");
        Collections.sort(arr, new sortByName());
        for(Group_23 s : arr){
            System.out.println(s);
        }
        
        // Lamda functions Java 8 and above
        Collections.sort(arr, (s1, s2)->Integer.compare(s1.marks, s2.marks));
        arr.sort((s1, s2)->Integer.compare(s1.marks, s2.marks));

        
        Collections.sort(arr, (s1, s2)->s1.name.compareTo(s2.name));
        arr.sort((s1, s2)->s1.name.compareTo(s2.name));

        // using anonymous class (NOT Preferrable)
        Collections.sort(arr, new Comparator<Group_23>(){
            public int compare(Group_23 s1, Group_23 s2){
                return Integer.compare(s1.marks, s2.marks);
            }
        });
    }
}
