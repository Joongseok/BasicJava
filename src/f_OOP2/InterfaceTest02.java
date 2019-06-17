package f_OOP2;

public class InterfaceTest02 {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		if (f instanceof Fight) {
			System.out.println("f는 Fight의 인스턴스이다.");
			Fight f2 = f;
		}
		
		if (f instanceof Unit2) {
			System.out.println("f는 Unit 2의 인스턴스이다.");
			Unit2 u = f;
		}
		
		if (f instanceof Object) {
			System.out.println("f는 Object의 인스턴스이다.");
			Object u = f;
		}
		
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현한 구현체이다.");
			Fightable f2 = f;
		}
		
		if (f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스를 구현한 구현체이다.");
			Movable f2 = f;
		}
		
		
	}
}
class Unit2{
	int x;
	int y;
	int currentHP;
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}

interface Fightable extends Movable,Attackable{
	
}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack(Unit u) {
		
	}

	
}