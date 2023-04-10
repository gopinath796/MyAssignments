package day7.assignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Bankinfo details are taken here");
	}

	public static void main(String[] args) {
		AxisBank axs = new AxisBank();
		axs.deposit();
		axs.fixed();
		axs.saving();

}
}
