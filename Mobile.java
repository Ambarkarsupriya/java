//program to acheive abstraction using a class and interface
 abstract class Standard_mobile{
		abstract void dialing();
		abstract void messaging();
	}
	interface Smart_phone{
		void touch();
		void videoCalling();
		void interNet();
	}
	class Mobile extends Standard_mobile implements Smart_phone{
    public void dialing()
    {
 	System.out.println("I can make calls");
 	}
 	public void messaging(){
 		System.out.println("I can message");
 	}
    public void touch()
    {
    	System.out.println("I have touch feature");
    }
    public void videoCalling(){
    	System.out.println("I have a video calling feature");
    }
    public void interNet(){
    	System.out.println("I have access to internet");
    }
    public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.dialing();
		obj.messaging();
		obj.touch();
		obj.videoCalling();
		obj.interNet();
	}
}