package Lec_35_Feb_25_OOPs;

interface genericInterface<T>{
    void setKey(T key);
    T getKey();
}
class example<T> implements genericInterface<T>{
    private T key;
    @Override
    public void setKey(T key){
        this.key = key;
    }
    @Override
    public T getKey(){
        return this.key;
    }
}

class key_val<K,V>{
    K key;
    V value;
    key_val(K key, V val){
        this.key = key;
        this.value = val;
    }
}

class normalClass{
    static <T> void print(T obj){
        System.out.println(obj);
    }
}

public class generics {
    public static void main(String[] args) {
        
        key_val<String,Integer> s1 = new key_val("Jai", 1);

        normalClass.print("Jai");
        normalClass.print(10);
    }
}
