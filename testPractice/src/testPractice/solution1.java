package testPractice;

//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다. -- 걍 무시함
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다 -- 걍 무시함

public class solution1 { // solution 클래스 안에
	public double solution(int[] arr) { //solution 매서드 선언 int[] arr 배열
		int num = 0; //int num 변수 선언
		double answer = 0; // double answer 변수 선언

		// 배열의 모든 원소값 더하기
		for (int i = 0; i < arr.length; i++) { //for문 배열 길이
			num += arr[i];
		}
		// double형으로 형 변환
		answer = (double) num / arr.length;
		return answer;

	}
}
