package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner s = new Scanner(System.in);
		SungJukDTO sungJukDTO = new SungJukDTO();
		
		System.out.println();
		System.out.print("번호 입력 : ");
        sungJukDTO.setNo(s.nextInt());
		System.out.print("이름 입력 : ");
		sungJukDTO.setName(s.next());;
        System.out.print("국어 입력 : ");
        sungJukDTO.setKor(s.nextInt());
        System.out.print("영어 입력 : ");
        sungJukDTO.setEng(s.nextInt());
        System.out.print("수학 입력 : ");
        sungJukDTO.setMath(s.nextInt());
        
        
        sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());
        sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
        
        System.out.println();
        System.out.println("입력 되었습니다.");
        
        System.out.println();
        list.add(sungJukDTO);
	}

		
	

}
