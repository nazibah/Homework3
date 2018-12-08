package OOP;

public class Apple extends Computer2 {
	
	
	int a=500;
	int b=600;
	private String computerName;
	private String computermodel;
	public Apple(String computerName, String computermodel) {
		
		this.computerName = computerName;
		this.computermodel = computermodel;
		
	}
	
	public String getComputerName() {
		return computerName;
	}

	public String getComputermodel() {
		return computermodel;
	}

	public void stop() {
		System.out.println("click power to stop");
		
	}
	
	public void volume() {
		System.out.println("click on side for volume");
		
	}
	
	public void start() {
		System.out.println("click power to start");
		
	}
	
	public void touchpad() {
		System.out.println("apple has touchpad");
		
	}

	public void computerPrice(int a ) {
	System.out.println("price: "+a);
	
	}
	
	public void computerPrice(int a,int b) {
	System.out.println("price: "+a+" "+b);
	
	}
}
