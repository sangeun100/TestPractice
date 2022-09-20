package testPractice;

public class solution4 {
//임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
    public long solution(long n) {
    	long answer = 0;
    	Double x = Math.sqrt(n);
    	if (x == x.intValue()) {
    		answer = (long) Math.pow(x + 1, 2);
    	}else {
    		answer = -1;
    	}
        return answer;
      
    }
}

//1. Math.sqrt함수를 이용하여 n 값의 제곱근을 x라는 변수에 담아준다
//Math.sqrt의 반환타입은 double형 임으로 변수의 타입은 double로 선언
//2. 실수형인 x의 값을 intValue() 메소드를 사용하면 x값을 정수 값으로 반환해준다
//eg. n=121이면 x는 실수값인 11.0 을 출력함 이 때, x.intValue()매서드를 사용하면 정수형인 11을 출력함
//양의 정수의 제곱근이기 때문에 Math.pow함수를 이용해 x+1의 제곱의 값을 answer변수에 담아준다
//여기서도 Math.pow의 변환타입은 double 형이라 (long)형으로 형 반환을 해주어야 한다
//3. 양의 정수가 아니라면 -1반환
//
//*Tip
//Math.sqrt(n) => n값의 제곱근을 double형으로 반환. 단, 음수사용시 NaN 출력
//x.intValue() => x값을 int값으로 반환
//Math.pow(n, 2) => n값의 2승을 double형으로 반환.