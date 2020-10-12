import java.util.ArrayList;

public class UserList {
	
	public UserList() {
		Users = new ArrayList();
	}
	
	public void addUser(User userName) {
		Users.add(userName);
	}
	
	public User getUser(int i) {
		return Users.get(i);
	}

	//make a function where you can access the get method of the arrayList of users from any class. Especially user class.
	
	public void returnUsers() {
		System.out.println("User's Names");
		LineBreak.printDoubleSpace();
		for (User userName: Users) {
			userName.getName();
		}
		LineBreak.printStraight();
	}
	
	public void returnUsersAndInformation() {
		System.out.println("Users and their Information");
		LineBreak.printDoubleSpace();
		for (User userName: Users) {
			userName.getAllInfo();	
		}
		LineBreak.printDoubleSpace();
		LineBreak.printStraight();
	}
	
	
	
	public boolean DoesUserExsist(String userName) {
		boolean exists = false;
		for(User name: Users) {
			if(name.getName().equals(userName)) {
				exists = true;
			}
		}
		return exists;
	}
	
	
	
	public int returnSizeOfList() {
		int x = 0;
		for(int i = 0; i<Users.size();i++ ) {
			x++;
		}
		return x;
	}
	
	public void returnUsersPurchasingPower(ItemList listName) {
	  System.out.println("Purchasing Power of All Users");
	  LineBreak.printDoubleSpace();
	  for (User name: Users) {
		name.purchasingPower(listName);
		System.out.println("");
	  }
	  LineBreak.printDoubleSpace();
	}
	
	private ArrayList <User> Users;
}
