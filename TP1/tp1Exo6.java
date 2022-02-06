import java.util.Scanner;
public class tp1Exo6 {
	public static void ThreeFiveSevenSum(){
		int cpt=0;
		for(int i = 1; i<=1000; ++i){
			if(((i%3==0)||(i%5==0)||(i%7==0)) && ((i%15!=0) || (i%21!=0) || (i%35!=0) || (i%105!=0))){
				System.out.println(i);
				cpt+=i;
			}
		}
		System.out.println(cpt);
	}
	public static void PrintLeapYear (){
		for(int i = 999; i <= 2012; ++i)
			if((i%4==0)&&(i%100!=0) || (i%400==0))
				System.out.println(i);
	}
	public static void main (String[] args){

	ThreeFiveSevenSum();

    PrintLeapYear();

	}
}