package kr.human.mavenEx;
//카드 1장을 저장하는 용도의 클래스

public class CardVO {
	private int value;
	private static String[] pattern = "◆♥♠♣".split("");
	//1글자씩 짤라서 배열로 만든다
	
	private static String[] numbers = "01,02,03,04,05,06,07,08,09,10,J,Q,K".split(",");
	//,로 구분해 배열로 만든다
	
	public CardVO(int value) {
		this.value = value;
	}
	
	public String getPattern() {
		return pattern[value/13];
	}
	public String getNumber() {
		return numbers[value%13];
	}
	
	@Override
	public String toString() {
		return getPattern() + getNumber();
	}
	
}
