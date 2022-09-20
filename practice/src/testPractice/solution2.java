package testPractice;

public class solution2 { // 프로그래머스 제공
//	정수 num이 짝수일 경우 "Even"을 반환하고 
//	홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
// if %2가 0 또는 0이면 even
// else if odd
    public String solution(int num) { //프로그래머스 제공
        String answer = ""; // 프로그래머스
        
        if(num%2 == 0) {
            answer="Even";
        }
        else if (num == 0) {
            answer="Even";
        }
        else {
            answer="Odd";
        }
        return answer; // 프로그래머스
    }
}