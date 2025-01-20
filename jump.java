public class jump{
    public static void main(String[] args) {
        
        // for(int i=1 ; i< 10 ; i++){

        //     if(i==3){
        //         continue;
        //     }
        //     if(i==7){
        //         break;
        //     }
        //     System.out.println(i);
        // }

        for(int i=2 ; i<=10 ; i++){
            
            if(i == 7){
                break;
            }
            if(i % 2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}