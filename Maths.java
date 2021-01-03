import java.util.Scanner;
class Maths {
	public static void main(String[] args) {
		
		float a,b,result;
		char op;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the values of a and b : ");
		a = sc.nextFloat();
		b = sc.nextFloat();

		System.out.println("Enter your option +,-,*,/ : ");

		op = sc.next().charAt(0);

		switch(op) { 

			case '+' : result= a+b;
			System.out.println("Add of two nos is : "+result);
			break;

			case '-' : result= a-b;
			System.out.println("Sub of two nos is : "+result);
			break;

			case '*' : result= a*b;
			System.out.println("Mul of two nos is : "+result);
			break;

			case '/' : result= a/b;
			System.out.println("Div of two nos is : "+result);
			break;


			default : 
			System.out.println("Enter the correct option ");

			return;
		} 
	}
}