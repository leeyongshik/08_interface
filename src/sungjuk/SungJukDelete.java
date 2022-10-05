package sungjuk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
				a=true;
			}
		}
		
		//방법 1
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getName().equals(name)) {
				it.remove();
			}
		}
		
		if( a == false) System.out.println("삭제할 이름이 없습니다.");
		else System.out.println(name+"의 모든 데이터를 삭제했습니다.");
		
		
		/* 방법 2
		//for( SungJukDTO sungJukDTO : list) {
		for( int j=1; j<=cnt;j++) {
			for( int i=0; i< list.size();i++) {
	        	if(list.get(i).getName().equals(name)) {
					list.remove(i);
				}
					
			}
		}
		
		*/
		
	}

}

/*
* 이름은 중복이 되어있다 -> 똑같은 이름이 2개 이상이라면 다 지우세요.

삭제할 이름을 입력 : 홍길동
삭제 할 이름이 없습니다.

또는 삭제 할 이름을 입력 : 홍길동 
*/
