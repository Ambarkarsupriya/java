	class Standard_mobile{
		void dialing();
		void messaging();
	}
	interface Smart_phone{
		void touch();
		void videoCalling();
		void interNet();
	}
class New_mobile extends Standard_mobile implements Smart_phone{
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
		New_mobile obj = new New_mobile();
		obj.dialing();
		obj.messaging();
		obj.touch();
		obj.videoCalling();
		obj.interNet();
	}	
}