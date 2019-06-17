package y_exam;

public class Exam_07_18_Test {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
			action(arr[i]);
	} // main
	
	public static void action(Robot r){
		if (r instanceof DanceRobot ) {
			((DanceRobot) r).dance();
		}
		if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		}
		if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		}
	}
}
class Robot {}
class DanceRobot extends Robot {
	public void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	public void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	public void draw() {
		System.out.println("그림을 그립니다.");
	}
}

