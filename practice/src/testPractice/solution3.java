package testPractice;

public class solution3 {
//���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
    public int solution(int n) {
        int answer = 0;
        System.out.println(answer);
        // �Է� ���� n���� ����� ���ϱ� -> �ݺ����� ���� n������ �۰ų�
        // ���� �� ���� n�� i������ ������ 0�� ������ �ش� ����� ��
        // �ش� ���ǿ� �´� ���� answer������ �ϳ��� �����ָ� ��
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) 
                answer += i;
        }
        return answer;
      
    }
}
