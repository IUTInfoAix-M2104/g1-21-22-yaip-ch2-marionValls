public class SumAverageRunningInt{
    public static void question(){
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      average=(double)sum/(double)(UPPERBOUND-LOWERBOUND+1);
      // Print sum and average
      System.out.println("The sum of "+LOWERBOUND+" to "+UPPERBOUND+" is "+sum+"\nThe average is "+average);
    }

    public static void question1(){
        int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      int number = LOWERBOUND;        // declare and init loop index variable
      while (number <= UPPERBOUND) {  // test
         sum += number;
         ++number;                    // update
      }
      // Compute average in double. Beware that int / int produces int!
      average=(double)sum/(double)(UPPERBOUND-LOWERBOUND+1);
      // Print sum and average
      System.out.println("The sum of "+LOWERBOUND+" to "+UPPERBOUND+" is "+sum+"\nThe average is "+average);
    }

    public static void question2(){
        int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;

      int number = LOWERBOUND;         // declare and init loop index variable
      do {
         sum += number;
         ++number;                     // update
      } while (number <= UPPERBOUND);  // test
      // Compute average in double. Beware that int / int produces int!
      average=(double)sum/(double)(UPPERBOUND-LOWERBOUND+1);
      // Print sum and average
      System.out.println("The sum of "+LOWERBOUND+" to "+UPPERBOUND+" is "+sum+"\nThe average is "+average);
    }

    public static void question4(){
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;

      // Use a for-loop to sum from lowerbound to upperbound
      for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      average=(double)sum/(double)(UPPERBOUND-LOWERBOUND+1);
      // Print sum and average
      System.out.println("The sum of "+LOWERBOUND+" to "+UPPERBOUND+" is "+sum+"\nThe average is "+average);
    }

    public static void question5(){
      double sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      final int LOWERBOUND = 111;
      final int UPPERBOUND = 8899;

      // Use a for-loop to sum from lowerbound to upperbound
      for (double number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number*number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int / int produces int!
      average=(double)sum/(double)((UPPERBOUND-LOWERBOUND+1));
      // Print sum and average
      System.out.println("The sum of "+LOWERBOUND+" to "+UPPERBOUND+" is "+sum+"\nThe average is "+average);
    }

    public static void question6(){
      double sumOdd  = 0;   // Accumulating sum of odd numbers
      double sumEven = 0;   // Accumulating sum of even numbers
      double absDiff;       // Absolute difference between the two sums
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 100;      
      // Compute sums
      for (double number = LOWERBOUND; number<=UPPERBOUND; ++number) {
         if (number%2==1) {
            sumOdd += number;
         } else {
            sumEven += number;
         }
      }
      // Compute Absolute Difference
      if (sumOdd > sumEven) {
         absDiff = sumOdd-sumEven;
      } else {
         absDiff = sumEven-sumOdd;
      }
      // OR use one liner conditional expression
      absDiff = (sumOdd > sumEven) ? sumOdd-sumEven : sumEven-sumOdd;
    }

    public static void main(String[] args){
        question1();
        question2();
        question4();
        question5();
        question6();
    }
}