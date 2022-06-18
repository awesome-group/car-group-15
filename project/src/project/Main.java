package project;

public class Main {

	public static void main(String[] args) {
		Car c=new Car();
		c.cN= "BMW";
		
		c.cS=400;
		
		c.cP=20000;
		
		
		c.carSpeed(c.cN,c.cS);
		c.carPrice(c.cN,c.cP);



	}

}
