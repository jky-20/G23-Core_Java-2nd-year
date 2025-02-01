package Lec_23_Jan_30_OOPs;

class Array{
    int size;
    int[] arr;
    
    // Constructor
    Array(int size){
        this.size = size;
        arr = new int[size];
    }

    // Copy Constructor
    Array(Array obj){
        // Shallow Copy
        this.size = obj.size;
        this.arr = obj.arr;

        // Deep Copy
        this.arr = new int[obj.size];
        for(int i=0 ; i < obj.arr.length ; i++){
            this.arr[i] = obj.arr[i];
        }
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        
        Array obj1 = new Array(3);
        Array obj2 = new Array(obj1);

        obj2.arr[1] = -1;

        System.out.println(obj1.arr[1]);
    }
}
