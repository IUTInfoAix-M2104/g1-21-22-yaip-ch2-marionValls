public class tp1Exo5 {
   public static void question1() {
      final int LOWERBOUND = 9;      // Store the lowerbound
      final int UPPERBOUND = 899;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum = sum + number;  // Accumulate number into sum
         ++number;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void question2() {
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 1000;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum = sum + number;  // Accumulate number into sum
         number+=2;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void question3() {
      final int LOWERBOUND = 7;      // Store the lowerbound
      final int UPPERBOUND = 1000;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum = sum + number;  // Accumulate number into sum
         number+=7;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void question4() {
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 100;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum += number*number;  // Accumulate number into sum
         ++number;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }

   public static void question5() {
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int product = 1;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         product = product * number;  // Accumulate number into sum
         ++number;            // increment number
      }
      // Print the result
      System.out.println("The product from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
   }

      public static void main(String[] args) {
          question1();
          question2();
          question3();
          question4();
          question5();
      }
}