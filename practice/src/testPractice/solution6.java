package testPractice;

import java.util.ArrayList;
import java.util.List;

//�ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. 
//������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
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
//1. n % 10�� ������ n�� �����ڸ����� �� �� ����
//2. n/10�� �����μ� n�� �����ڸ��� ���ŵǰ� ���� �ڸ��� ���� �ڸ��� ��
//3. 1~2�� n�� 0�� �ɶ����� �ݺ������� n�� �ڿ������� �� �ڸ��� ����Ʈ�� ����
//4. ����Ʈ�� ������ answer �迭�� �־� return
		