package kr.human.mavenEx;

public class DeckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Deck deck = new Deck(); //카드 한묶음이 섞여서 만들어짐
			
			for(int i=0; i<10; i++)//10장만 가져와
			System.out.print(deck.nextCard() + " ");
			System.out.println();
			for(int i=0; i<10; i++)//10장만 가져와
				System.out.print(deck.nextCard() + " ");
			System.out.println();
			for(int i=0; i<10; i++)//10장만 가져와
				System.out.print(deck.nextCard() + " ");
			System.out.println();

			for(int i=0; i<10; i++){//10장만 가져와
				CardVO cardVO = deck.nextCard();
				if(cardVO!=null) {
					System.out.print(cardVO + " ");
				}else {
					System.out.println("더이상 카드가 없다.");
					break;
				}
			}
			System.out.println();
	}

}
