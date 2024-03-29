package f_OOP2;

public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3); // x좌표 1, y좌표 2, z좌표 3
	}
}

class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}


class Point3D extends Point2{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);// Point2()
		this.z = z;
		}

	
	public String toString(){
		return " x좌표 : "+ super.x + ","+" y좌표 : "+ y + ","+" z좌표 : "+ z ;
	}
	
}









