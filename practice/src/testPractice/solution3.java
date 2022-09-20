package testPractice;

public class solution3 {
//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
    public int solution(int n) {
        int answer = 0;
        System.out.println(answer);
        // 입력 받은 n값의 약수값 구하기 -> 반복문을 통해 n값보다 작거나
        // 같을 때 까지 n을 i값으로 나눠서 0이 나오면 해당 약수가 됌
        // 해당 조건에 맞는 값을 answer변수에 하나씩 더해주면 됌
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) 
                answer += i;
        }
        return answer;
      
    }
}
