package testPractice;

public class solution2 { // ���α׷��ӽ� ����
//	���� num�� ¦���� ��� "Even"�� ��ȯ�ϰ� 
//	Ȧ���� ��� "Odd"�� ��ȯ�ϴ� �Լ�, solution�� �ϼ����ּ���.
// if %2�� 0 �Ǵ� 0�̸� even
// else if odd
    public String solution(int num) { //���α׷��ӽ� ����
        String answer = ""; // ���α׷��ӽ�
        
        if(num%2 == 0) {
            answer="Even";
        }
        else if (num == 0) {
            answer="Even";
        }
        else {
            answer="Odd";
        }
        return answer; // ���α׷��ӽ�
    }
}