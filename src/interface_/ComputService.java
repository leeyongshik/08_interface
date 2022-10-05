package interface_;

import java.util.Scanner;

public class ComputService {
	
	public void menu() {
		Scanner s = new Scanner(System.in);
    	int num;
    	Compute compute = null;

        while (true) {
            System.out.println("***************");
            System.out.println("    1. 합 ");
            System.out.println("    2. 차 ");
            System.out.println("    3. 곱 ");
            System.out.println("    4. 몫 ");
            System.out.println("    5. 끝내기");
            System.out.println("***************");
            System.out.print("   번호 : ");
            num = s.nextInt();
            System.out.println();
            
            if(num ==5) break;
            else if(num ==1) compute = new Sum();
            else if(num ==2) compute = new Sub();
            else if(num ==3) compute = new Mul();
            else if(num ==4) compute = new Div();
            else System.out.println("잘못 입력 하였습니다");
            compute.disp();
            System.out.println();
        }//while
	}//menu()
}
