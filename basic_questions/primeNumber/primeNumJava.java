
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class primeNumJava {

    public static void main(String[] args) {
        System.out.println("enter the number ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        // if number is divisible by any number from 2 to 9 then that number is composite 
        int temp = 0;

         if ( a <2){
                System.out.println("number is not prime ");
                return;
    
                
            }

            
         if ( a ==2){
                System.out.println("number is  prime ");
                return;
    
                
            }

        for (int x = 2 ; x <=a -1 ; x++){
                if (a%x==0){
                    temp ++;
                }

        }

        if (temp >0){
            System.out.println("given number is not  prime");
        }else{
            System.out.println("number is  prime ");
        }


        System.out.println(5%10==0);
        

        // if(a <= 1){
        //     System.out.println("number is not prime ");
        // }else if (int z = 2 , z<=num-1){
        //     System.out.println("number is not prime ");


        // }else {
        //     System.out.println("number is prime ");
        // }
    }
}