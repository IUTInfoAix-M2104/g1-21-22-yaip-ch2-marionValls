import java.util.Scanner;
public class GradesStatistics{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int number = in.nextInt();
        
        int[] students;
        students = new int[number];
        for (int i=0 ; i < number ; i++ ) { 
            System.out.print("Enter the grade for students "+ (i+1) + " : ");
            students[i]= in.nextInt();
        }
        in.close();
        
        double average = 0;
        
        for (int j=0 ; j < number ; j++ ) { 
            average+=students[j];
        }
        
        int min = students[0];
        int max = students[0];
        
        for (int k=1 ; k < number ; k++ ){ 
            if (students[k] < min){
                min = students[k];
            }
            if (students[k] > max){
                max = students[k];
            }
        }
        
        average/=(double)number;
        System.out.println("Average is "+average);
        System.out.println("Max is "+ max);
        System.out.println("Min is "+ min);    
    }
}