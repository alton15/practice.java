package new_practice;

public class AdvancedFor {
	public static void main(String[] args) {
		int[] scores = { 60, 70, 80, 90, 100 };
		int sum = 0;
			// Ÿ�� ���� : �迭
		for(int score : scores) {
			sum += score;	//���๮
		}
		System.out.println("sum: " + sum);
		
		/*
		 1. �迭���� ������ ù ��° ���� �ִ��� �Ǵ��Ѵ�.
		 2. ������ ���� �����ϸ� �ش� ���� ������ �����Ѵ�.
		 3. ���๮�� �����Ѵ�.
		 4. ���๮ ������ ������ ���� �ִ��� �Ǵ�, ������ ����.
		 	!!**�̶� for���� �ݺ� Ƚ���� �迭�� �׸� ��**!!
		 */
	}
}