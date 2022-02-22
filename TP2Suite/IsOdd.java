import java.util.Scanner;
public class IsOdd{
    public static void isOdd(int number){
        
        if (number%2 == 0){
            System.out.println(number + " is an even number");
        } else{
            System.out.println(number + " is an odd number");
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inStr;
        System.out.print("Enter a number: ");
        inStr = in.nextInt(); 

        isOdd(inStr);
    }
}