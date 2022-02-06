import java.util.Scanner;

public class CircleComputation {
    public static void CircleComputation()
    {
        double radius,diameter,circumference,area;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = in.nextDouble();

        diameter=radius*2.0;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f\n", diameter);
        System.out.printf("Area is: %.2f\n", area);
        System.out.printf("Circumference is: %.2f\n", circumference);
    }

    public static void SphereComputation()
    {
        double radius,diameter,surfaceArea,volume;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = in.nextDouble();

        diameter=radius*2.0;
        surfaceArea= 4.0* Math.PI * radius * radius;
        volume = (4.0/3.0) * Math.PI * radius * radius * radius;

        System.out.printf("Diameter is: %.2f\n", diameter);
        System.out.printf("Surface area is: %.2f\n", surfaceArea);
        System.out.printf("volume is: %.2f\n", volume);
    }

    public static void CylinderComputation()
    {
        double radius,height,baseArea,surfaceArea,volume;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        radius = in.nextDouble();
        System.out.println("Enter the height: ");
        height = in.nextDouble();

        baseArea =Math.PI*radius*radius;
        surfaceArea=2.0*Math.PI*radius+2.0*baseArea;
        volume=baseArea*height;

        System.out.printf("Base area is: %.2f\n", baseArea);
        System.out.printf("Surface area is: %.2f\n", surfaceArea);
        System.out.printf("volume is: %.2f\n", volume);
    }

    public static void main(String[] args)
    {
        CircleComputation();
        SphereComputation();
        CylinderComputation();
    }
}