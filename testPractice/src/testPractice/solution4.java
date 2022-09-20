package testPractice;

public class solution4 {
//������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
//n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
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

//1. Math.sqrt�Լ��� �̿��Ͽ� n ���� �������� x��� ������ ����ش�
//Math.sqrt�� ��ȯŸ���� double�� ������ ������ Ÿ���� double�� ����
//2. �Ǽ����� x�� ���� intValue() �޼ҵ带 ����ϸ� x���� ���� ������ ��ȯ���ش�
//eg. n=121�̸� x�� �Ǽ����� 11.0 �� ����� �� ��, x.intValue()�ż��带 ����ϸ� �������� 11�� �����
//���� ������ �������̱� ������ Math.pow�Լ��� �̿��� x+1�� ������ ���� answer������ ����ش�
//���⼭�� Math.pow�� ��ȯŸ���� double ���̶� (long)������ �� ��ȯ�� ���־�� �Ѵ�
//3. ���� ������ �ƴ϶�� -1��ȯ
//
//*Tip
//Math.sqrt(n) => n���� �������� double������ ��ȯ. ��, �������� NaN ���
//x.intValue() => x���� int������ ��ȯ
//Math.pow(n, 2) => n���� 2���� double������ ��ȯ.