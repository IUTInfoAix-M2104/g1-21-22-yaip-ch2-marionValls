public class Product1Ton{
    public static void main(String[] args){
      long product = 1;      // The accumulated product, init to 1
      final int LOWERBOUND = 1;
      final int UPPERBOUND = 20;
      for (int i = LOWERBOUND; i<=UPPERBOUND; ++i){
         product*=i;
      }
      System.out.println(product);
    }

}
