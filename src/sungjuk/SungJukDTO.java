package sungjuk;

public class SungJukDTO implements Comparable<SungJukDTO> { //1인분
	private int no;
	private String name;
	private int kor, eng, math, tot; // 번호는 중복 되지 않게 ,이름, 국어, 수학, 총점, 평균
	private double avg;
	
	public SungJukDTO() {
		
	}
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg = (double)tot / 3;
	}

	@Override
	public int compareTo(SungJukDTO p) {
		if (this.tot < p.tot) return -1;
		else if (this.tot > p.tot) return 1;
		return 0;
	}
	

}
