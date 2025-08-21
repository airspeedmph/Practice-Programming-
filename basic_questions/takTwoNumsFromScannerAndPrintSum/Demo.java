// take two numbers from scanner and print the sum 

public class Demo {

        public static void main(String[] args) {
              
         Scanner scanner = new Scanner(System.in);
        
         System.out.println("Enter first number:");
         int a = scanner.nextInt();
        
         System.out.println("Enter second number:");
         int b = scanner.nextInt();
        
         System.out.println("The sum of two given numbers is: " +(a +b ));
        
         scanner.close();        
       
       }

}