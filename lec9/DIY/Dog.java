/*
 * 这个类和他的 sub-class 充分展现了，
 * sub-class super-class override dynamic-type
 * 是如何缔造一个无限循环的
 * 以此为例说明，继承会破坏封装
 */
public class Dog {
	/*
	// 这套代码没有什么问题
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
	
	// 用这套代码，出现死循环
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
