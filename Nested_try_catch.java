/* NESTED TRY ND CATCH BLOCK*/
import java.util.Scanner;
class Nested{
	void except() {
	try 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a= sc.nextInt();
		System.out.println("Enter the value of b: ");
	    int b= sc.nextInt();
	a=a/b;
	System.out.println(a);
	try {
		int arr[] = new int[10];
		arr[13]=12;
	}
	catch (Exception e) {
		System.out.println("array bounds are crossed");
	}
	
} 
	catch(Exception e)
	{
		System.out.println("Deniminator should noT be 0");
	}
}
}
public class Nested_try_catch {
public static void main(String[] args) {
	Nested obj=new Nested();
	obj.except();
	
}
}

