import java.lang.*;
class Fruit_rates{
	void fruitRates(){
		int apple =40;
		int mango=30;
		int pineApple=80;
		int papaya=20;

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
class MultipleInheritance{
	public static void main(String[] args) {
		Fruit_rates obj = new Fruit_rates();
		obj.fruitRates();
		Fruit n = new Fruit();
		n.fruitRates();
	}
}