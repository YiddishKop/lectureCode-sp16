
public class VerboseDog extends Dog{

	@Override
	public void barkMany(int num) {
		int n = num;
		while (n > 0) {
			System.out.println("as a dog, i will say: ");
			bark(); 
			// ���� this �� VerboseDog���ͣ����õ��� 
			// VerboseDog��Dog�м̳й����� bark()����
			// �÷�����ʵ�����ٴε�����barkMany(1).ʹ�õ���Ȼ��this
			// ��Ȼ�� VerboseDog����Ҳ���Ǳ������������ѭ����
			n--;
		}
	}
	public static void main(String[] args) {
		VerboseDog vd = new VerboseDog();
		vd.barkMany(3);
	}
	
}
