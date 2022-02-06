public class ComputePI{
   public static void question(){
            double sum = 0.0;
      int MAX_DENOMINATOR = 1000;   // Try 10000, 100000, 1000000
      for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
         if (denominator % 4 == 1) {
            sum += 1/(double)denominator;
         } else if (denominator % 4 == 3) {
            sum -= 1/(double)denominator;
         } else {   // remainder of 0 or 2
            System.out.println("Impossible!");
         }
      }
      sum*=4;
      System.out.println("PI : "+sum);
   }
   public static void main(String[] args){
      double sum = 0.0;
        int MAX_TERM = 10000;
        for(int term=1;term<=MAX_TERM;term++)
        {
            if(term % 2 == 1){
                sum += 1.0/((term*2)-1);
            }
            else
            {
                sum -= 1.0/((term*2)-1);
            }
        }
        sum=4*sum;
        System.out.println("My pi " + sum);
      System.out.println("comparaison : "+((sum/Math.PI)*100));
    }
}