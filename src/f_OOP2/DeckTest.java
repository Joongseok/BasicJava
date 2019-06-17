package f_OOP2;

public class DeckTest {
	public static void main(String[] args) {
		Card c = new Card(1, 1);
		System.out.println(c);//SPADE,A
		Card c1 = new Card(2,5);
		System.out.println(c1);//CLOVER,5
		System.out.println();
		Deck d = new Deck();
		d.pick();
		System.out.println(d.pick(5));
		d.pick();
		System.out.println(d.pick());
		d.shuffle();
//		System.out.print(d.shuffle());
		d.shuffle(3);
//		System.out.println(d.shuffle(4));

	}
}


class Card{
	static final int KIND_MAX = 4; // 카드 무늬수
	static final int NUM_MAX = 13; // 무늬별 카드수
	
	static final int SPAED = 1;
	static final int CLOVER = 2;
	static final int DIAMOND = 3;
	static final int HEART = 4;
	
	int kind;
	int number;
	
	Card(int kind ,int number){
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		String kind = "";
		String number ="";
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "CLOVER";
			break;
		case 3:
			kind = "DIAMOND";
			break;
		default:
			kind = "HEART";
			break;
		}
		switch (this.number) {
		case 1:
		number = "A";
			break;
		case 11:
			number = "j";
			break;
		case 12:
			number = "q";
			break;
		case 13:
			number = "k";
			break;

		default:
			number += this.number;
			break;
		}
		return kind+","+number;
	}
	
}




class Deck{
	//1. 카드의 수량을 저장할수 있는 변수 CARD_NUM을 선언 및 초기화 해주세요
	//	단 , 초기화시 Card클래스의 상수를 이용해주세요
	static int CARD_NUM = Card.KIND_MAX*Card.NUM_MAX;
	//2. 카드 52장을 저장할수 있는 변수 c를 선언 및 생성해주세요
	//	 단 ,  c의 크기는 1에서 만든 변수를 이용해주세요
	Card[] c = new Card[CARD_NUM];
	//3. 기본생성자를 만들어주세요
	//   생성자 내부에서 수행될 문장은 변수 c의 각방을 1,1 ~ 4,13까지로 초기화해주세요
	Deck(){
		int number = 0;
		for (int i = 1; i < Card.KIND_MAX+1; i++) {
			for (int k = 1; k < Card.NUM_MAX+1; k++) {
				c[number++] = new Card(i,k);
//					 = c1;
			}
		}
	}
	//4. c에서 카드한장을 뽑을수 있는 메서드를 만들어주세요 pick
	//  단, 인자값으로 받은 방의 카드를 반환해야한다.
	Card pick(int a){
		return c[a];
	}
	//5. c에서 랜덤한 방의 카드한장을 뽑을수 있는 메서드를 만들어주세요 pick
	//   단 4번에서 만든 pick메서드를 활용해주세요
	Card pick(){
			int a = (int)(Math.random()*CARD_NUM);
			return pick(a);
	}
	//6. 카드를 섞어주세요 shuffle
	//   연습문제형태로 섞어주세요
	void shuffle(){
		Card temp;
		for (int i = 0; i < CARD_NUM; i++) {
			int a = (int)(Math.random()*CARD_NUM);
			
			temp = c[i];
			c[i] = c[a];
			c[a] = temp;
		}
	}
	//7. 카드를 섞어주세요 shuffle
	//   두개의 랜덤방의 카드를 교체해주세요
	//   인자값으로 받은 숫자만큼 반복해주세요
	void shuffle(int a){
		Card temp;
		for (int i = 0; i < a; i++) {
			int x = (int)(Math.random()*CARD_NUM);
			int b = (int)(Math.random()*CARD_NUM);
			
			temp = c[x];
			c[x] = c[b];
			c[b] = temp;
		}
	}
}
