package kr.human.mavenEx;

import java.util.Random;

public class Deck {
	private CardVO[] cards; //카드들을 저장할 배열
	private int index; //카드를 나눌때 몇번째 카드인지 저장할 변수
	
	//생성자
	public Deck() {
		//cards = new CardVO[52];
		this(1);//자신의 생성자를 부른다
	}
	
	public Deck(int count) {
		cards = new CardVO[52*count];
		shuffle(count);
	}
	
	//카드를 섞어보자
	private void shuffle(int count) {
		Random random = new Random();
		int temp;
		//묶음만큼 반복
		for(int i = 0; i<count; i++) {
			//1묶음당 52장 반복
			for(int j=0; j<52;j++) {
				do {
					temp = random.nextInt(52);//0~51사이의 난수
				}while(cards[temp] != null);//그 위치의 객체가 없다면(비었다면) 카드를 만들어서 넣는다.
				cards[temp] = new CardVO(j);
			}
		}
	}
	//메소드가 next로 시작하면 어딘가에서 얻어온다는 의미
	public CardVO nextCard() {
		CardVO cardVO = null; //리턴타임의 변수를 선언
		if(index<cards.length) cardVO = cards[index++];
		return cardVO; //리턴
	}
	
}
