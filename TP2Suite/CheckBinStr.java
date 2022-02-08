import java.util.Scanner;
public class CheckBinStr{
    public static void main(String[] args){// Declare variables
      String inStr;     // The input string
      int inStrLen;     // The length of the input string
      char inChar;      // Each char of the input string
      boolean isValid;  // "is" or "is not" a valid binary string?
      
      Scanner in = new Scanner(System.in);
      // Prompt and read input as "String"
      System.out.print("Enter a binary string: ");
      inStr = in.next();   // use next() to read a String
      inStrLen = inStr.length();
      
      isValid = true;  // Assume that the input is valid, unless our check fails
      for (int i = 0; i<inStrLen; ++i) {
         inChar = inStr.charAt(i);
         if (!(inChar == '0' || inChar == '1')) {
            isValid = false;
            break;  // break the loop upon first error, no need to continue for more errors
                    // If this is not encountered, isValid remains true after the loop.
         }
      }
      if (isValid) {
         System.out.println("\""+inStr+"\" is a binary string");
      } else {
         System.out.println("\""+inStr+"\" is NOT a binary string");
      }
      // or using one liner
      System.out.println(isValid ? ("\""+inStr+"\" is a binary string") : ("\""+inStr+"\" is NOT a binary string"));
    }
}