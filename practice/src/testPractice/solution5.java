package testPractice;

//�ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
//������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.

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