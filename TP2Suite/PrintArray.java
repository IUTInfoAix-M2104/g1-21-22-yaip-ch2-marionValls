import java.util.Scanner;
public class PrintArray{
    public static void main(String[] args){      // Declare variables
      final int NUM_ITEMS;
      int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known
      String s;
      int cpt=0;

      Scanner in = new Scanner(System.in);
      System.out.print("Enter the number of item: ");
      NUM_ITEMS = in.nextInt();   // use next() to read a String

      // Allocate the array
      items = new int[NUM_ITEMS];

      // Prompt and read the items into the "int" array, if array length > 0
      if (items.length > 0) {
         System.out.print("Enter the value of all items (separated by space): ");
         for (int i = 0; i < items.length; ++i) {  // Read all items
                items[i]= in.nextInt();
         }
      }
      System.out.print("The values are : ");
      // Print array contents, need to handle first item and subsequent items differently
      for (int i = 0; i < items.length; ++i) {
         if (i == 0) {
            // Print the first item without a leading commas
            System.out.print(items[i]);
         } else {
            // Print the subsequent items with a leading commas
            System.out.print(", "+items[i]);
         }
         // or, using a one liner
        // System.out.print((i == 0) ? (items[i]) : (", "+items[i]));
      }
    }
}