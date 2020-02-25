package marathon;

//������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

//�����濡 ������ �������� �̸��� ��� �迭 participant�� 
//������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
//�������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

//���ѻ���
//������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
//completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
//�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
//������ �߿��� ���������� ���� �� �ֽ��ϴ�.

import java.util.Arrays;

public class Marathon {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		String temp = "";

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i = 0;

		while (i < completion.length) {
			if (!completion[i].equals(participant[i])) {
				temp = participant[i];
				break;
			} else {
				i++;
			}
		}

		if (!temp.equals("")) {
			answer = temp;
		} else {
			answer = participant[participant.length - 1];
		}
		System.out.println(answer);

		return answer;

	}

	public static void main(String[] args) {

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		solution(participant, completion);

	}

}
