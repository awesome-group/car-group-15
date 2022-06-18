package main;

public class Main {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.cN="BMW";
		c.cS=400;
		c.cP=57000;
		c.carSpeed(c.cN,c.cS);
		c.carPrice(c.cN, c.cP);
		
	}

}
