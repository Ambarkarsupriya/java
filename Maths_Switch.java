import java.util.Scanner;
class Maths_Switch {
public static void main(String[] args) {

	float a,b,result;
	int op;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a : ");
	a = sc.nextFloat();

	System.out.println("Enter the value of b : ");
	b = sc.nextFloat();
	
	System.out.println("Enter your option : ");
	op = sc.nextInt();

	switch(op) {
		case 1 :result = a+b;
		 System.out.println("add of a and b is : "+result);
		 break;

		 case 2 : result = a * b;
		  System.out.println("mul of a and b is : "+result);
		 break;

		 case 3 : result = a - b;
		  System.out.println("sub of a and b is : "+result);
		 break;

		 case 4 : result = a / b;
		  System.out.println("div of a and b is : "+result);
		 break;

		 default : 
		  System.out.println("Enter  the correct option");
		  return;
		}	

	}


}
