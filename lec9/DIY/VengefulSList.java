
/** SList with additional operation printLostItems() which prints all items
  * that have ever been deleted. */
public class VengefulSList<Item> extends SList<Item>{
	/*
	 * ������һ��ʼ�Ƕ��������� private fields �����١�ɾ��������
	 * 	private Node vengeSentinel;
	 *  private int vengeSize;
	 * ���Ǻ������֣�����ֱ��ʹ�ø��������ͳ��������fields,ʵ����
	 * ��Ҳ�����ҵı��⣬��Ϊ��ɾ������ �������һ�� SList,ֻ���Լ�
	 * �����á� ������֮�󣬴����һ�����٣���Ϊֱ�ӿ��Ը��ø�����
	 * �� method.
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