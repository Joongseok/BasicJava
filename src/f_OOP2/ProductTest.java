package f_OOP2;

import java.util.Arrays;
import java.util.Vector;

public class ProductTest {//테스트 클래스
	public static void main(String[] args) {
		Tv t1 = new Tv("LG Curved", 800); // tv클래스 객체
		CoffeeMachine cf = new CoffeeMachine("네스프레소", 80);//커피머신클래스 클래스객체
		BodyFriend bf = new BodyFriend("바디프렌드", 700);// 바디프렌드클래스 객체
		
		
		Buyer b = new Buyer("박서경", 10000);//  바이어클래스 객체 
		Buyers b1 = new Buyers();
//		b.buy(t1);
//		b.refund(bf);
//		b.summary();
//		b1.buyerAdd(b);
//		b1.buyerRemove(b);
//		b1.buyerMoney(1);
//		b1.chargeMoney("박서경", 1000);
//		System.out.println(b.money);
		b1.buyerList();
	}
}

class Product{
	String name;
	int price;
	int mileage;
	
	public Product() {
	}
	
	Product(String name, int price){
		this.name =name;
		this.price = price;
		mileage = price/100;
	}
}

class Tv extends Product{
	Tv(String name, int price){
		super(name,price);
	}

	@Override
	public String toString() {
		return "Tv";
	}
}

class CoffeeMachine extends Product{
	CoffeeMachine(String name, int price){
		super(name,price);
	}
	
	@Override
	public String toString() {
		return "CoffeeMachine";
	}
}

class BodyFriend extends Product{
	BodyFriend(String name, int price){
		super(name,price);
	}
	
	@Override
	public String toString() {
		return "BodyFriend";
	}
}

class Buyer {
	String name;
	int money;
	int mileage;
	
	
	
	
	Vector<Product> item = new Vector<Product>(); //구매내역
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void buy (Product p){// 
		if (money < p.price) {
			System.out.println("나가");
			return;
		}
		money -= p.price;
		mileage +=p.mileage;
		item.add(p);
		System.out.println("제품"+p+"의가격은"+p.price+"만원입니다.");
		System.out.println("구매후 남은금액"+money+"만원입니다.");
		System.out.println("아이고 고객님~ "+p+"를 구매해 주셔서 감사합니다."+"\n적립된 마일리지는"+mileage+"만입니다.");
		System.out.println();
//		System.out.println(item.size());
	}
	// refund 반품
	void refund(Product rp){
		if (item.isEmpty()) {
			System.out.println("구매하신 물품이 존재하지 않습니다.");
			return;
		}
		if (item.remove(rp)) {
			System.out.println();
			money += rp.price;
			mileage -= rp.mileage;
			System.out.println("제품"+rp+"의가격은"+rp.price+"만원입니다.");
			System.out.println("제품"+rp+" 가 반환되었습니다."+"감사합니다.");
			System.out.println("반품되고 남은금액"+money+"만원입니다."+"\n적립된 마일리지는"+mileage+"만입니다.");
//			System.out.println(item.size());
			return;
		}
		System.out.println("반환할 제품을 찾을 수 없습니다.");
		return;
		
	}
	// summary 영수증
	/*
	 
	 
	  		영  수  증
	  		
	  구매물품
	  	Tv			  800만원
	  	CoffeeMachine 70만원
	  	BodyFriend	  700만원
	  	총합 			  1570만원
	  	
	 고객님의 남은돈은 	  8430만원이고
	 		마일리지는 157만점 입니다.
	 이용해 주셔서 감사합니다.
	 
	 //고객여러명?
	  
	 */
	void summary(){
		if (!item.isEmpty()) {
			
			int sum = 0; 
			System.out.println("\t===========================");
			System.out.println("\t      영	    수	  증	");
			System.out.println("\t===========================");
			System.out.println("\t구매물품\t\t가격");
			System.out.println("\t===========================");
			Product c;
			
			for (int i = 0; i < item.size(); i++) {
				c = (Product)(item.get(i));
				System.out.println("\t"+c.name +"\t"+c.price+"만원");
				
				sum += (int)c.price;
			}
			System.out.println("\t"+"총합\t\t"+sum+"만원\n");
//		Product c1 =(Product)item.get(0);
//		Product c2 =(Product)item.get(1);
//		System.out.println("\t"+c1.name +"\t\t"+c1.price+"만원");
//		Product c3 =(Product)item.get(2);
//		System.out.println("\t"+c2.name +"\t\t"+c2.price+"만원");
			System.out.println("\t고객님의 남은돈은\t"+money+"만원이고");
			System.out.println("\t\t마일리지는\t"+mileage+"만점 입니다.\n\t이용해 주셔서 감사합니다.");
			System.out.println("\t===========================");
		}else{
		System.out.println("출력될 영수증이 없습니다.");
		return;
		}
	}
}

class Buyers{
	Vector<Buyer> buyer = new Vector<Buyer>();
	
	{
		Buyer b1 = new Buyer("이씨", 100);
		buyer.add(b1);
		
		Buyer b2 = new Buyer("김씨", 100);
		buyer.add(b2);
		
		Buyer b3 = new Buyer("박씨", 100);
		buyer.add(b3);
		
		Buyer b4 = new Buyer("이영씨", 200);
		buyer.add(b4);
		
	}
	
	
	
	//사람추가메서드
	boolean buyerAdd(Buyer add){//사람, 이름/돈
		boolean result = buyer.add(add);
		return result;
	}
	//사람삭제 메서드
	Buyer buyerRemove(String remove){
		Buyer b = null;
		for (int i = 0; i < buyer.size(); i++) {
			if(remove.equals(buyer.get(i).name)){
				b = buyer.remove(i);
			}
		}
		return b;
	}
	//돈충전 메서드
	void chargeMoney(String name , int money){
		for (int i = 0; i < buyer.size(); i++) {
			if (name.equals(buyer.get(i).name)) {
				buyer.get(i).money += money;
			}
		}
	}
	//사람목록을 출력
	void buyerList(){
		for (int i = 0; i < buyer.size(); i++) {
			Buyer bName = buyer.get(i);
			 System.out.println(bName.name+"\t"+bName.money+"\t"+bName.mileage);
		}
	}
	
	//이씨인 사람만 모아서 반환하는 메서드
	
	Vector<Buyer> sungList(){
		Vector <Buyer> list = new Vector<Buyer>();
		for (int i = 0; i < buyer.size(); i++) {
			if (buyer.get(i).name.charAt(0)=='이') {
				//buyer벡터에 있는 방 i번째에 있는 데이터를 받아와서 list벡터에 추가한다
				list.add(buyer.get(i));
			}
		}
		return list;
	}
	
	
	
	
}
