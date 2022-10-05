package sungJuk2;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		Scanner scan = new Scanner(System.in);
		boolean a = false;
		
		System.out.println();
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) {
				list.remove(i);
				i--;
			}
		}
	}

}
