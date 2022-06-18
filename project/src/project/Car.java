package project;

public class Car implements Carİnterface {
	String cN;
	int cS;
	int cP;
	
	@Override
	public void carSpeed(String name, int speed) {
		System.out.println(name +" "+ speed);
		
	    
		
	}

	@Override
	public void carPrice(String name, int price) {
		System.out.println(name+" "+ price);
		
	}
	

}
