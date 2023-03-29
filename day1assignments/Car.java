package week1.day1assignments;

public class Car {

	public void driveCar() {
		System.out.println("Could you please drive a Car");

	}
	public void applyBreak() {
		System.out.println("Could you please apply break");

	}
	public void soundHorn() {
		System.out.println("Could you please apply soundhorn");

	}
	public void ispuncture() {
		System.out.println("Could you please check car tyre is puncture");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car verify = new Car();
		verify.driveCar();
		verify.applyBreak();
		verify.soundHorn();
		verify.ispuncture();
		

	}

}
