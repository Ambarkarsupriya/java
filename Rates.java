import java.lang.*;
import java.util.Scanner;



class Fruit_rates{

	void fruitRates(){
		int apple,mango,pineApple,papaya;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter apple rate:");
		apple = sc.nextInt();
		System.out.println("Enter mango rate: ");
		mango = sc.nextInt();
		System.out.println("Enter pineApple rate: ");
		pineApple = sc.nextInt();
		System.out.println("Enter papaya rate:");
		papaya = sc.nextInt();


		System.out.println("Rate of one apple :"+apple);
		System.out.println("Rate of one mango :"+mango);
		System.out.println("Rate of one pineApple:"+pineApple);
		System.out.println("Rate of one papaya :"+papaya);
	}
}
class Fruit extends Fruit_rates{
	void fruitRates(){
		int apple =20;
		int mango=40;
		int pineApple=90;
		int papaya=10;

		System.out.println("Rate of one apple :"+apple);
		System.out.println("Rate of one mango :"+mango);
		System.out.println("Rate of one pineApple:"+pineApple);
		System.out.println("Rate of one papaya :"+papaya);

	}
}
class Rates{
	public static void main(String[] args) {

		Fruit_rates obj = new Fruit_rates();
		obj.fruitRates();
		Fruit n = new Fruit();
		n.fruitRates();
	}
}