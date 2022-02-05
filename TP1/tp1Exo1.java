import java.util.Scanner;
public class tp1Exo1 {
	public static void carre()
	{
		System.out.println("* * * * *");
		for(int i = 0; i<3; ++i)
			System.out.println("*       *");
		System.out.println("* * * * *");
	}
	public static void triangle(){
		System.out.println("* * * * *\n *     *\n  *   *\n   * *\n    *");
	}
	public static void a(){
		System.out.println("* * * * *\n * * * * *\n* * * * *\n * * * * *\n* * * * *");		
	}
	public static void d(){
		System.out.println("    *    \n* *   * *\n   * *\n  *   *\n *     * ");	
	}
	public static void sheep(){
		System.out.println("          '__'\n          (oo)\n  /========//\n / || @@ ||\n*  ||----||\n   VV    VV\n   ''    ''");
	}

	public static void main (String[] args){
		//carré
		carre();
		//triangle
		triangle();
		//figure a
		a();
		//figure d
		d();
		sheep();
	}
}