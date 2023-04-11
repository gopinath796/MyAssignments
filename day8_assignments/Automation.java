package day8_assignments;

public class Automation extends MultipleLangauge{
	public void java() {
		System.out.println("Learning Java");
	}
	

		public void selenium() {
		System.out.println("Learning Selenium");
		
	}


	@Override
	public void ruby() {
		System.out.println("Learning Ruby");
		
	}
	public static void main(String[] args) {
		Automation at=new Automation();
		at.java();
		at.ruby();
		at.selenium();
		at.python();

	}

}
