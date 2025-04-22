package Lec_53_Date_Time_Random;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random random = new Random();
        int num = random.nextInt(); // return random int

        // in particular range
        num = random.nextInt(100);  // 0-99

        // 10 random numbers in range[0,100]
        for(int i=0 ; i<10 ; i++){
            // System.out.println(random.nextInt(101));
        }

        // in range [50,100]
        System.out.println(random.nextInt(50, 101));    // Java >=17
        System.out.println((random.nextInt(51)+50));    // Java <17

        // Generate a 6 digit OTP
        System.out.println(random.nextInt(100000, 1000000));

        // OTP without any 0s
        int OTP = 0;
        for(int i=0 ; i<6 ; i++){
            OTP = OTP * 10;
            OTP = OTP + random.nextInt(9)+1;    // Or use nextInt(1,10);
        }
        System.out.println("6 digit OTP : " + OTP);
    }
}
