package i_javaLang;

public class EqualsTest02 {
	public static void main(String[] args) {
		Person p1 = new Person(1111111111111L);
		Person p2 = new Person(1111111111111L);
		
		System.out.println(p1 == p2);//주소를 비교하기 떄문에 false
		if (p1.equals(p2)) {
			System.out.println("같은사람");
		}else{
			System.out.println("다른사람");
		}
		
	}
}


class Person{
	private long regNo;
	
	public Person(long regNo) {
		this.regNo = regNo;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean result = false;
		if (obj == null && obj instanceof Person&& regNo == ((Person)obj).regNo) {
			result = true;
		}
		return result;
	}
	
}