abstract class Cse_a{
	 void colgate(){
	 	System.out.println("My name is colgate.");

	 }
	
	 void closeup(){
	  	System.out.println("My name is closeup.");
	 }
}

class Cse_b extends Cse_a{
	void suppy(){
		System.out.println("My name is suppy.");
	}
	void sippy(){
		System.out.println("My name is sippy.");
	}
}

class Cse_c extends Cse_b{
	void shabu(){
		System.out.println("My name is Shabu.");
	}
	void extra(){
		super.closeup();
	}
}


public class CseInheritance{
	public static void main(String[] args) {
		Cse_c obj = new Cse_c();
		obj.colgate();
		obj.closeup();
		obj.shabu();
		obj.extra();
	}
} 