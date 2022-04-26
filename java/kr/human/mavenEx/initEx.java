package kr.human.mavenEx;

public class initEx {
	public static void main(String[] args) {
		initValue initV;
		
		initV.viewStaticMember();
		
		initV = new initValue();
		
		//인스턴스 변수의 초기화는 생성자에서 하고
		//정적 변수의 초기화(복잡할경우)는 정적 초기화 블록에서
		
	}
}
