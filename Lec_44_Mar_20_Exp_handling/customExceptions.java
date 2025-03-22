package Lec_44_Mar_20_Exp_handling;

class InsufficientBalance extends Exception{
    InsufficientBalance(String msg){
        super(msg);
    }
}
class InvalidSendersUPI extends RuntimeException{
    private int errorCode;
    InvalidSendersUPI(int code, String msg){
        super(msg);
        this.errorCode = code;
    }
    int getErrorCode(){
        return this.errorCode;
    }
}

public class customExceptions {
    static void sendMoney(int amount, String number) throws InsufficientBalance{
        if(amount > 500){
            throw new InsufficientBalance("Not enough money in your account, Please earn more");
        }
        if(!number.equals("7982143632")){
            throw new InvalidSendersUPI(101,"Pleace recheck mobile num.")
        }
    }
    public static void main(String[] args) {
        try{
            sendMoney(600, "7982134");
        }
        catch(InsufficientBalance ex){
            System.out.println(ex.getMessage());
        }
        catch(InvalidSendersUPI ex){
            System.out.println(ex.getErrorCode() + " : " + ex.getMessage());
        }
    }
}
