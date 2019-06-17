package a_variable;
//[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
public class Hello {
	public static void main(String[] args){
		int sum = 0;
		for(int num = 1; num<11; num++){
			for(int num2 =1; num2<num;num++){
				sum += num2;
			}
		}
		
	}
}

/*
 문제4-3 해설 : 가로가 하나의 뭉텅이임 (1) 1+2 1+2+3 ... 맨뒤에 가지는 수를 하나 만든다
 			 num=1 ;  1 =>10까지 바뀌는수  증가량 1 블럭별()합계는 sum=0 
 			 sum2=0 ; 는 전체합계 
  		sum+=num; 1더함(최종합계임) sum2+=sum; num++(증가하는 수는 num이됌) sum+=num; >sum2+=sum; > num++
  		sum=0 ; //블럭별합계
  		sum2=0//전체합계
  		sum+=num;
  		sum2+=sum;
  	두번쨰 방식 num =1 //1~1
  			 num =2 1~2
  			 num =3 1~3
  			 for(int num=1; num<11; num++){
  			 	for(int num2= 1; num2<num+1; num2++){
  			 		sum+=num2;
  			 	}
  			 }
//  	두번째 방식 for(int i=1; i<11; i++){//10번까지 반복
//  				sum += i*(11-i); //sum = sum+i*(11-i)
//  				}
//  				
  4-4 해설 : 2가지 방식 이있음 ++++ ---- while과 break를 이용하시오 홀수일땐 더하고 짝수일땐 빼면됌 합이 100 초과가 되는순간 나가면됌 부호 음수양수로 바꿔서 풀수도있음
  
  4-11 해설 :  1+1=2 a+b=c 더하고 a를 b로 보내고 b를 c로 보내고 합치고 옮기고
  
  4-13 해설 :false일떄 break사용 끝까지가면안댐
  4-14 해설 : 야구 스트라이크 볼과 비슷 
  4-15 해설 : 
 */
