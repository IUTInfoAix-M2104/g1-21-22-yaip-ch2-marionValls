import java.lang.Math;
import java.util.ArrayList;
public class PrimeNumbers {
	//exo 1--------------------------------------------------------------
	public static boolean isPrime(int aPosInt){
		if(aPosInt<1)return false;
		if(aPosInt==2 || aPosInt==1)return true;
		int cpt=0;
		int i = 2;
		while(i<=Math.sqrt(aPosInt) && (aPosInt%i)!=0)
		{
			++i;
		}
		return(i==(int)Math.sqrt(aPosInt)+1);
	}
	public static void PrimeList(int upperBound){
		int cpt=0;
		for(int i = 1; i<=upperBound; ++i)
			if(isPrime(i)){
				System.out.println(i);
				++cpt;
			}
		System.out.println("["+cpt + " primes found ("+String.format("%.2f",(double)cpt/upperBound*100)+"%)]");
	}
	//exo 2 ------------------------------------------------------------
	
	public static void main (String[] args){
		PrimeList(10000);
	}
}