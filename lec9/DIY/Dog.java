/*
 * ���������� sub-class ���չ���ˣ�
 * sub-class super-class override dynamic-type
 * ����ε���һ������ѭ����
 * �Դ�Ϊ��˵�����̳л��ƻ���װ
 */
public class Dog {
	/*
	// ���״���û��ʲô����
	public void bark() {
		System.out.println("bark~~");
	}
	public void barkMany(int num) {
		int n = num;
		while (n > 0) {
			bark();
			n--;
		}
	}*/
	
	// �����״��룬������ѭ��
	public void bark() {
		barkMany(1);
	}
	public void barkMany(int num) {
		int n = num;
		while (n > 0) {
			System.out.println("bark~~");
			n--;
		}
	}
}
