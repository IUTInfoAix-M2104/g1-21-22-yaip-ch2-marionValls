public class tp1Exo3 { 
   public static void RectangleComputation(double length,double width) {
      double perimeter, area;
    

      area = length*width;
      perimeter = length*2 + 2*width;
      
      // Print results
      System.out.print("The area is ");  
      System.out.println(area);          
      System.out.print("The perimeter is ");
      System.out.println(perimeter);
   }

    public static void CylinderComputation(double radius,double height) {
      double surfaceArea, baseArea, volume;

      final double PI = 3.14159265;

      baseArea = radius * radius * PI;

      surfaceArea = 2.0 * radius * PI * height;

      volume = radius * radius * PI * height;
 
      // Print results
      System.out.print("The base area is ");  
      System.out.println(baseArea);          
      System.out.print("The surface area is ");
      System.out.println(surfaceArea);
      System.out.print("The volume is ");
      System.out.println(volume);
   }

   public static void main(String[] args) {
       double length = 10.2;
       double width = 5.1;
       RectangleComputation(length,width);

       double radius = 2.0;
       double height = 3.0;
       CylinderComputation(radius,height);

   }
}