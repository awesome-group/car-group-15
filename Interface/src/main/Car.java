package main;

public class Car implements CarInterFace {
	String cN;
	long cS;
	long cp;
	long cP;
	@Override
	public void carSpeed(String cN, long cS) {
		System.out.println("Masinin adi "+cN+" sureti "+cS+"km/saat-dir.");
	}
	@Override
	public void carPrice(String cN, long cP) {
		System.out.println("Masinin adi "+cN+" qiymeti "+cP+"₼-dir.");
	}


}
