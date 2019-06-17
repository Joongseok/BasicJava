package f_OOP2;



public class TimeTest {
	public static void main(String[] args) {
		TimeVO t = new TimeVO();
		t.setHour(30);
		System.out.println(t.getHour());
		t.setMinute(140);
		System.out.println(t.getHour()+" : "+t.getMinute());// 8 : 20
		t.setSeconds(10000);//2시간 46분 40초
		System.out.println(t.getHour()+" : "+t.getMinute()+" : "+t.getSeconds());// 11 : 6 : 40
	}
}

class TimeVO{
	private int hour;
	private int minute;
	private int seconds;
	
	void setHour(int hour){
//		if (hour >23) {
//			this.hour = hour%24;
//		}else{
//			this.hour = hour;
//		}
		this.hour = hour%24  ;
	}
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
//		this.hour += minute/60;
//		this.hour = hour >23 ? hour%24 : hour < 24 ?  hour: 0 ;
//		this.minute = minute%60;
		setHour(this.hour += minute/60);
		this.minute = minute%60   ;
	}
	
	int getMinute(){
		return minute;
	}
	
	void setSeconds(int seconds){
		setMinute(this.minute += seconds/60 );
		this.seconds = seconds%60 ;
//		this.seconds = seconds%60;
//		this.minute += seconds/60;
//		this.hour +=minute/60; 
//		this.hour = hour >23 ? hour%24 : hour < 24 ?  hour: 0 ;
//		this.minute = minute > 59 ? minute%60 : minute < 59 ?  minute : 0 ;
	}
	
	int getSeconds(){
		return seconds;
	}
}
