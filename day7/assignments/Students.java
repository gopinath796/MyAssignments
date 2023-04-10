package day7.assignments;

public class Students {

	public int getStudentInfo (int id){
		return id;
	}
	public void getStudentInfo() {
		int id=796;
		String name = "Ruby";
		System.out.println("Name and Id of the Student: "+ id+" is" +name);
				
	}
	public String getStudentInfo(String emailid,String mobileno) {
		return emailid+"\n"+mobileno;
	}
	public static void main(String[] args) {
		Students info = new Students();
		System.out.println(info.getStudentInfo(8869));
		info.getStudentInfo();
		info.getStudentInfo("Ruby@gmail.com","9966587410");
	}


}
