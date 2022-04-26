package kr.human.mavenEx;
//한반의 성적을 처리할 클래스
public class ClassVO {
	//1.변수를 선언한다
	private StudentVO[] studentVOs;
	private int index = 0; //배열의 첨자
	
	//2.생성자를 만든다
	public ClassVO() {
		this(30);//학생수 지정이 없으면 기본은 30명
	}
	
	public ClassVO(int count) {//학생수를 지정하면 해당 수만큼 학생 확보
		studentVOs = new StudentVO[count];
	}
	
	//3. Getter Setter를 만든다
	
	//4. 추가기능
	//학생을 추가하는 메서드
	public void addStudent(StudentVO vo){
		if(index < studentVOs.length) studentVOs[index++] = vo;
		
	}
	
	public void addStudent(String stuNo, String name, int kor, int eng, int mat, int edps){
		if(index < studentVOs.length) studentVOs[index++] = new StudentVO(stuNo, name, kor, eng, mat, edps);
		
	}
	
	//학번으로 조회
	//이름으로 조회는 동명이인이 있을까봐 안만든다
	public StudentVO getStudentVO(String stuNo) {
		StudentVO vo = null;
		/*
		for(int i = 0; i<studentVOs.length; i++) {
			if(studentVOs[i]!= && studentVOs[i].getStuNo().equals(stuNo)) {
				vo = v;
				break;
			}
		}
		*/
		ranking();//석차를 새로 구하고 
		for(StudentVO v : studentVOs) {
			if(v.getStuNo().equals(stuNo)) {
				vo = v;
				break;
			}
		}
		return vo;
	}
	//석차 구하기
	private void ranking() {
		//모두 석차를 1등으로 만든다
		for(int i =0; i<index; i++) studentVOs[i].setRank(1);
		
		//석차를 구한다.
		//여기에는 length를 쓰면 안된다. 학생이 몇명인지 index에 들어있다. 배열전체의 길이볻다는 index로 하자
		for(int i = 0; i<index-1;i++) {
			for(int j = i + 1; j<index; j++) {
				if(studentVOs[i].getTotal() > studentVOs[j].getTotal()) {//i의 점수가 크면
					studentVOs[j].setRank(studentVOs[j].getRank()+1);//j의 석차가 증가
				}
				else if(studentVOs[j].getTotal() > studentVOs[i].getTotal()) {//j의 점수가 크면
					studentVOs[i].setRank(studentVOs[i].getRank()+1);
				}
			}
		}
	}
	
	//5. 몇개를 오버라이딩 (toString, equals, hashCode ....)
	//toString만 해보자
	//리턴타입을 먼저 선언하고 리턴먼저 하고 그 안에 내용들을 입력하자
	@Override
	public String toString() {
		String result = "";
		ranking();//석차를 새로구하고
		for(int i = 0; i <index; i++) {
			result += studentVOs[i] + "\n";
		}
		return result;
	}
}
