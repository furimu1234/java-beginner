import java.util.Random; // �����_�����������߂̃v���O�C�������̃v���O�����ɓǂݍ���

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int num = 10; num >= -20; num--) { // num��10�ɃZ�b�g���� num��-20�ɂȂ�܂�-1����
			Random random = new Random(); //�@���܂��Ȃ�
			boolean result = random.nextBoolean(); // True or False �̂ǂ��炩��ϐ� result�Ƀv���O�����������ő������
			if (num % 2 == 0 && result == true) { // num ��2�Ŋ���؂�A���Aresult��True�̏ꍇ
				System.out.println(num + "�@�� 2 = 0 �ł��B (true = 1)"); 
			}
			
			else if (num % 2 == 0 && result == false) { // num ��2�Ŋ���؂�A���Aresult��false�̏ꍇ
				System.out.println(num + "�@�� 2 = 0 ���Ǝv���܂��B (false = 0)");
			}
			
			else if (num % 5 == 0 && result == true) { // num ��5�Ŋ���؂�A���Aresult��true�̏ꍇ
				System.out.println(num + "�@�� 5 = 0 �ł��B (true = 1)");
			}
			
			else if (num % 5 == 0 && result == false) { // num ��5�Ŋ���؂�A���Aresult��false�̏ꍇ
				System.out.println(num + "�@�� 5 = 0 ���Ǝv���܂��B (false = 0)");
			}
			
			else { // ��L�̂ǂ�ɂ����Ă͂܂�Ȃ��ꍇ
				System.out.println(num + "�@�͖��m�̐��l�ł��B");
			}
			
			// �����֌W�Ȃ��ŏo�͂���
			System.out.println("--------------------------------------");
		}

	}

}
