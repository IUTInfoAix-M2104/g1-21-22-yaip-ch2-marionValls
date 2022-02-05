public class tp1Exo2 {
    public static void SixIntegersSum(){ 
      int number1 = 11;  
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int number6 = 66;
      int sum; 
      sum = number1 + number2 + number3 + number4 + number5 + number6;  
      System.out.print("The sum is "); 
      System.out.println(sum);  
   }
    public static void SevenIntegersSum(){ 
      int number1 = 11;  
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int number6 = 66;
      int number7 = 77;
      int sum; 
      sum = number1 + number2 + number3 + number4 + number5 + number6 + number7;  // Compute sum
      System.out.print("The sum is "); 
      System.out.println(sum);  
   }
   public static void FiveIntegersProduct(){ 
      int number1 = 11;  
      int number2 = 22;
      int number3 = 33;
      int number4 = 44;
      int number5 = 55;
      int product;  
      product = number1 * number2 * number3 * number4 * number5;  
      System.out.print("The sum is ");  
      System.out.println(product);  
   }
   public static void main(String[] args) {
       SixIntegersSum();
       SevenIntegersSum();
       FiveIntegersProduct();
   }
}