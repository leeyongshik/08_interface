package sungjuk;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		Scanner s = new Scanner(System.in);
		SungJukService sungJukService = new SungJukService();
		
		while(true) {
			System.out.println();
			System.out.println("1. 총점으로 내림차순");
			System.out.println("2. 이름으로 오름차순");
			System.out.println("3. 이전 메뉴 ");
			System.out.print("   번호 : ");
			int a = s.nextInt();
			
			if(a==3) break;
			if (a==1) {
				Collections.sort(list);
				System.out.println();
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		        for (int i =0; i <list.size(); i++) {
		        	if(list.get(i).getName()!=null) {
		        		System.out.println(list.get(i).getNo()+"\t"+list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+list.get(i).getTot()+"\t"+String.format("%.2f", list.get(i).getAvg()));
		        	}
		        }
			}
			else if(a==2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() { 
					public int compare(SungJukDTO p1, SungJukDTO p2) {
						return p1.getName().compareTo(p2.getName()) * -1;
					}
				}; 
				Collections.sort(list, com);	
				
				System.out.println();
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		        for (int i =0; i <list.size(); i++) {
		        	if(list.get(i).getName()!=null) {
		        		System.out.println(list.get(i).getNo()+"\t"+list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+list.get(i).getTot()+"\t"+String.format("%.2f", list.get(i).getAvg()));
		        	}
		        }
				
			}
			else {
				System.out.println("1 ~ 3 사이의 숫자만 입력하세요");
				continue;
			}
		
		}
		/*
		1. 총점으로 내림차순
		2. 이름으로 오름차순
		3. 이전메뉴
		  번호 : 1
		  */

	}

}
