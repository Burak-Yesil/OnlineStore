  import java.util.ArrayList;

public class ItemList {

	public ItemList() {
	Items = new ArrayList();
	itemsInList = 0;
}
	
	public void addItem(Item itemName) {
		Items.add(itemName);
		temp.add(itemName);
		itemsInList ++;
	}
	
	public Item GetItem(int i) {
		return Items.get(i);
	}
	
	
	public int returnNumOfItems() {
		return itemsInList;
	}
	
	public void returnEachItemsInfo() {
		LineBreak.printStraight();
		for (Item name: Items) {
			name.returnAllInfo();
			
		}
	}
	
	public void returnItemsInList() {
		for (Item name: Items) {
			System.out.println(name.returnName());
		}
	}
	
	public void PercentIncreaseAll(double percentNumber) {
		for (Item name: Items) {
			name.percentIncrease(percentNumber);
		}
	}
	
	public void percentOffAll(double percentNumber) {
		for (Item name: Items) {
			name.PercentOff(percentNumber);
		}
	}
	
	public void ResetInfoToDefault() {
		Items = temp;
	}
	
	public void MakeCurrentListAsDefualtState() {
		temp = Items;
	}
	
	private ArrayList <Item> Items;
	private int itemsInList;
	
	//Private temporary ArrayList to make a default state of the arrayList
	
	private ArrayList <Item> temp = new ArrayList();
}
