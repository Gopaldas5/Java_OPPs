package PracticeCodes;

import java.util.Random;

public class EvenOddNUmber {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
        Random random = new Random();
            int num = random.nextInt(899) + 100;

            System.out.println(" Random number : " + num);

            if (num % 2 == 0)
                System.out.println(" Number is even : "+num);
            else
                System.out.println(" Number is odd : "+num);
        }

    }
}
