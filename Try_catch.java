class A{
	void except() {
	try 
	{	
	int a=100,b=0;
	a=a/b;
	System.out.println(a);
	
	
} 
	catch(Exception e)
	{
		System.out.println("Deniminator should noT be 0");
	}
}
}
public class Try_catch {
public static void main(String[] args) {
	A obj=new A();
	obj.except();
	
}
}
