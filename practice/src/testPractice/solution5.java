package testPractice;

//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

public class solution5 {
    public int solution(int n) {
    	String s = Integer.toString(n);
        int answer = 0;

        for (int i=0; i<s.length(); i++) {
        	answer += Integer.parseInt(s.substring(i, i+1));
        }

        return answer;
    }
}