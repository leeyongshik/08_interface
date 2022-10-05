package sungjuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {


	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		System.out.println();
		
        System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
        for (int i =0; i <list.size(); i++) {
        	if(list.get(i).getName()!=null) {
        		System.out.println(list.get(i).getNo()+"\t"+list.get(i).getName()+"\t"+list.get(i).getKor()+"\t"+list.get(i).getEng()+"\t"+list.get(i).getMath()+"\t"+list.get(i).getTot()+"\t"+String.format("%.2f", list.get(i).getAvg()));
        	}
        }
        System.out.println();
        System.out.println();
        /*
        System.out.println("방법 2");
        for(SungJukDTO sungJukDTO : list) {
        	System.out.println(sungJukDTO.getNo()+"\t"+sungJukDTO.getName()+"\t"+sungJukDTO.getKor()+"\t"+sungJukDTO.getEng()+"\t"+sungJukDTO.getMath()+"\t"+sungJukDTO.getTot()+"\t"+String.format("%.2f", sungJukDTO.getAvg()));
        }
        */
	}
		
	

}
