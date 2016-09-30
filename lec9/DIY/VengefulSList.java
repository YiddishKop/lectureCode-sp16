
/** SList with additional operation printLostItems() which prints all items
  * that have ever been deleted. */
public class VengefulSList<Item> extends SList<Item>{
	/*
	 * 这里我一开始是定义了两个 private fields 来跟踪‘删除链’：
	 * 	private Node vengeSentinel;
	 *  private int vengeSize;
	 * 但是后来发现，可以直接使用父类对象来统筹这两个fields,实际上
	 * 这也符合我的本意，因为‘删除链’ 本身就是一个 SList,只是自己
	 * 不敢用。 这样做之后，代码进一步减少，因为直接可以复用父类中
	 * 的 method.
	 */
	private SList<Item> deletedSList;
	
	public VengefulSList(){
		super();
		deletedSList = new SList<Item>();
	}
	public VengefulSList(Item x) {
		super();
		deletedSList = new SList<Item>();
	}
	
	public void insertVengeBack(Item x) {
		deletedSList.insertBack(x);
	}
	/** Deletes and returns last item. */
	@Override
    public Item deleteBack() {
		Item deletedItem = super.deleteBack();
		insertVengeBack(deletedItem);
		return deletedItem;
	}
	public void printLostItems() {
		deletedSList.print();
	}

	public static void main(String[] args) {
		
		VengefulSList<Integer> vs1 = new VengefulSList<Integer>();
		vs1.insertBack(1);
		vs1.insertBack(5);
		vs1.insertBack(10);
		vs1.insertBack(13);
		// vs1 is now: [1, 5, 10, 13] 

		vs1.deleteBack();
		vs1.deleteBack();
		// After deletion, vs1 is: [1, 5]

		// Should print out the numbers of the fallen, namely 10 and 13.
		System.out.print("The fallen are: ");
		vs1.printLostItems();
	}
} 