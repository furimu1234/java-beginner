# ���K������Ă݂�

10 ~ 20�̊Ԉȉ��̏���������v���O�����������Ȃ����B

10 ~ 20�̒l��������ϐ���`num`�Ƃ���

�܂��Atrue or false�������_���ɕϐ�`result`�ɑ�����A���̌��ʂŏo�͂��镶�͂�ς��邱�ƁB

num �� 2�Ŋ���؂��l�ł���Aresult��true�̏ꍇ
num �� 2 = 0 �ł��B (true = 1) �Əo�͂���

num �� 2�Ŋ���؂��l�ł���Aresult��false�̏ꍇ
num �� 2 = 0 ���Ǝv���܂��B (false = 0) �Əo�͂���

num �� 5�Ŋ���؂��l�ł���Aresult��true�̏ꍇ
num �� 5 = 0 �ł��B (true = 1) �Əo�͂���

num �� 5�Ŋ���؂��l�ł���Aresult��false�̏ꍇ
num �� 5 = 0 ���Ǝv���܂��B (false = 0) �Əo�͂���

��L�̂ǂ�ɂ����Ă͂܂�Ȃ��ꍇ
num �͖��m�̐��l�ł��B"

�܂������֌W�Ȃ�
-------------------------------------- �Əo�͂���(�n�C�t���̐����Ȃ�)

#hint

```java
import java.util.Random; // �����_�����������߂̃v���O�C�������̃v���O�����ɓǂݍ���

public class test {

	public static void main(String[] args) {
		int num;
		for (?) {
			Random random = new Random(); //�@���܂��Ȃ�
			boolean result = random.nextBoolean(); // True or False �̂ǂ��炩��ϐ� result�Ƀv���O�����������ő������
			
			...(ry
		}	
	}
}