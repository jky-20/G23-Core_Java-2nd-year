package Lec_52_April_21_Enums;

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

enum status{
    Success(200, "OK"),
    NotFound(404, "URL does not exist"),
    TimeOut(501, "Taking too long to respond, Try again Later");

    private int code;
    private String msg;

    private status(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    int getStatusCode(){
        return this.code;
    }
    String getStausMsg(){
        return this.msg;
    }
}

enum Maths{
    Add{
        public int operation(int a, int b){
            return a + b;
        }
    },
    Multiply{
        public int operation(int a, int b){
            return a * b;
        }
    };
    public abstract int operation(int a, int b);
}

public class enums {
    public static void main(String[] args) {
        
        Day d = Day.Monday;

        switch(d){
            case Monday:
                System.out.println("Here we go again !!!!");
                break; 
            case Friday:
                System.out.println("wohoooo, weekend");
                break; 
            default:
                break;
        }

        status urlResponse = status.Success;
        int statusCode = urlResponse.getStatusCode();

        for(status s : status.values()){
            System.out.println(s.getStatusCode() + " :: " + s.getStausMsg());
        }

        int sum = Maths.Add.operation(10, 20);
        System.out.println(sum);
    }
}
