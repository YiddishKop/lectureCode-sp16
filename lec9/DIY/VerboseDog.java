
public class VerboseDog extends Dog{

	@Override
	public void barkMany(int num) {
		int n = num;
		while (n > 0) {
			System.out.println("as a dog, i will say: ");
			bark(); 
			// 传入 this 是 VerboseDog类型，调用的是 
			// VerboseDog从Dog中继承过来的 bark()方法
			// 该方法的实现又再次调用了barkMany(1).使用的仍然是this
			// 仍然是 VerboseDog对象，也就是本函数。如此死循环。
			n--;
		}
	}
	public static void main(String[] args) {
		VerboseDog vd = new VerboseDog();
		vd.barkMany(3);
	}
	
}
