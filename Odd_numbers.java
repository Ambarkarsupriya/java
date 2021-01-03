 import java.util.Scanner;

 public class Odd_numbers {

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the range :  ");
 		int n = sc.nextInt();
 		System.out.print("Even numbers are :  ");

 		for(int i=1; i<=n; i++) { 
 			if (i%2 != 0)
 				System.out.println(i + "  ");
 				
 			}
 		}
 	}

