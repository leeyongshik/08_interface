package interface_;

public class ComputeMain {

	public static void main(String[] args) {
		ComputService computService = new ComputService();
		computService.menu();
		System.out.println("프로그램을 종료합니다.");
	}

}

