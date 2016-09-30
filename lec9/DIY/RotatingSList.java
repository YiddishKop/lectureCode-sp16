/* SList, but with additional rotateRight operation. */
public class RotatingSList<Item> extends SList<Item>{

	
	public void rotateRight() {
		// method 1:
			// 找到 backNode
			// backNode.next = sentinel.next; sentinel.next = backNode
			// second backNode.next = null;
		// method 2：使用父类函数
			// item = getBack()
			// insertFront(item)
			// deleteBack
		Item item = getBack(); 
		insertFront(item);
		deleteBack();
		
	}
	/** To do: Implement RotatingSList such that code compiles and outputs correct result. */

	public static void main(String[] args) {
		RotatingSList<Integer> rsl = new RotatingSList<Integer>();
		/* Creates SList: [10, 11, 12, 13] */
		rsl.insertBack(10);
		rsl.insertBack(11);
		rsl.insertBack(12);
		rsl.insertBack(13);

		/* Should be: [13, 10, 11, 12] */
		rsl.rotateRight();
		rsl.print();
	}
} 