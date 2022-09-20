package testPractice;

import java.util.ArrayList;
import java.util.List;

//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
public class solution6 {
    public int[] solution(long n) {
    	List<Integer> list = new ArrayList<>();
    	
    	while (n !=0) {
			list.add((int)(n % 10));
			n /=10;
		}
        int[] answer = new int[list.size()];
        for (int i =0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}


//************************************************************
//1. n % 10을 함으로 n의 일의자리수를 알 수 있음
//2. n/10을 함으로서 n의 일의자리가 제거되고 십의 자리가 일의 자리가 됌
//3. 1~2를 n이 0이 될때까지 반복함으로 n을 뒤에서부터 한 자리씩 리스트에 저장
//4. 리스트의 내용을 answer 배열로 넣어 return
		