package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;
import interface_.Compute;

public class SungJukService { // menu()
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {

		Scanner scan = new Scanner(System.in);
		SungJuk sunJuk=null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("*************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 삭제");
			System.out.println("   5. 정렬");
			System.out.println("   6. 끝내기");	
			System.out.println("*************");
			System.out.print("  번호 : ");
			num = scan.nextInt();
			
			if(num == 6) break; //while를 벗어나라
			if(num == 1) {
				sunJuk = new SungJukInsert();
			}
			else if(num == 2) {
				sunJuk = new SungJukList();
			}
			else if(num == 3) {
				sunJuk = new SungJukUpdate();				
			}
			else if(num == 4) {
				sunJuk = new SungJukDelete();
			}
			else if(num == 5) {
				sunJuk = new SungJukSort();
			}
			else {
				System.out.println("1 ~ 6 사이의 숫자만 입력하세요");
				continue;
			}
			
			sunJuk.execute(list);
			
		}//while
		
		
	}
}
