import java.util.Scanner;
public class SquarePattern{
    public static void main(String[] args){
      int size;
      Scanner in = new Scanner(System.in);  // Scan the keyboard
      System.out.print("Enter the size: ");  // No newline for prompting message
      size = in.nextInt();                     // Read next input as "int"
      // Outer loop to print each of the rows
      for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
         // Inner loop to print each of the columns of a particular row
         for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
            System.out.print("# ");   // Use print() without newline inside the inner loop
         }
         // Print a newline after printing all the columns
         System.out.println();
      }
    }
}