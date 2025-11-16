package basic_questions.printHollowRect;

public class printHollowRect {
    public static void main(String[] args) {
        int rows = 4;
        int column = 5;
        
        //rows 
        for (int i = 1 ; i<=rows ; i++){
            for(int j =1 ; j<=column;j++){
                if (i==1 || j==1 || i==rows||j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
