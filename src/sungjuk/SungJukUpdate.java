package sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int no = scan.nextInt();
		
		int sw = 0;
		for(SungJukDTO sungJukDTO : list) {
			if(sungJukDTO.getNo() == no) {
				sw = 1;
				
				System.out.println();
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO.getNo()+"\t"+sungJukDTO.getName()+"\t"+sungJukDTO.getKor()+"\t"+sungJukDTO.getEng()+"\t"+sungJukDTO.getMath()+"\t"+sungJukDTO.getTot()+"\t"+String.format("%.2f", sungJukDTO.getAvg()));
				
				System.out.println();
				System.out.print("수정 할 이름 입력 : ");
				String name = scan.next();
				System.out.print("수정 할 국어 입력 : ");
				int kor = scan.nextInt();
				System.out.print("수정 할 영어 입력 : ");
				int eng = scan.nextInt();
				System.out.print("수정 할 수학 입력 : ");
				int math = scan.nextInt();
				
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				
				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
				break;
			}//if
		}//for
		
		if(sw == 0) System.out.println("잘못된 번호 입니다.");

	}
	
	
	
	
	
	
	
	
	
	
}
	/*
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		SungJukDTO sungJukDTO = new SungJukDTO();
		Scanner s = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int no = s.nextInt();
		
		
		int sw=0;
		for( int i=0; i<list.size(); i++) {
			if(sungJukDTO.getNo() == no) {
				sw =1;
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(list.get(i).getNo()+"\t"+list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+list.get(i).getTot()+"\t"+String.format("%.2f", list.get(i).getAvg()));
				System.out.println();
				
				System.out.print("수정 할 이름 입력 : ");
	        	String name = s.next();
	        	System.out.print("수정 할 국어 입력 : ");
	        	int kor = s.nextInt();
	        	System.out.print("수정 할 영어 입력 : ");
	        	int eng = s.nextInt();
	        	System.out.print("수정 할 수학 입력 : ");
	        	int math = s.nextInt();
	        	
	        	sungJukDTO.setName(name);
	        	sungJukDTO.setKor(kor);
	        	sungJukDTO.setEng(eng);
	        	sungJukDTO.setMath(math);
	        	
	        	System.out.println("수정하였습니다.");
	        	
	        	sungJukDTO.calc();
			
	        	break;
			}
			
			if (sw == 0) System.out.println("잘못된 번호 입니다.");
			
			
		}
		
	}

}
*/
