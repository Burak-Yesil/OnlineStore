
public class User {
	//Takes userName for the created user and adds the user to the specified User server
	public User(String userName, int age, double moneyInAccount, UserList listName, String password) {
		this.userName = userName;
		this.moneyInAccount = moneyInAccount;
		this.age = age;
		Password = password;
		listX = listName;
		listName.addUser(this);
	}
	
	public String getName() {
		return userName;
	}
	
	public void getAllInfo() {
		System.out.println("Name: " + userName);
		System.out.println("Age: " + age);
		System.out.println("Money Available: "+ moneyInAccount);
		LineBreak.printDoubleSpace();

	}
	
	public double getMoneyInAccount() {
		return moneyInAccount;
	}
	
	public int returnNumOfItemsAbleToBePurchased(ItemList name) {
		for(int i = 0; i< name.returnNumOfItems(); i++ ) {
			if(moneyInAccount >= name.GetItem(i).returnPrice()) {
				numOfItemsAbleToBePurchased ++;	
			}}
		return numOfItemsAbleToBePurchased;
	}

	
	public void purchasingPower(ItemList name) {
		System.out.println("Users Name: " + userName);
		System.out.println("");
		for(int i = 0; i< name.returnNumOfItems(); i++ ) {
			if(moneyInAccount >= name.GetItem(i).returnPrice()) {
				System.out.println(name.GetItem(i).returnName());
				this.returnNumOfItemsAbleToBePurchased(name);
				if(numOfItemsAbleToBePurchased > 1) {
				LineBreak.printOneDottedLine();
				}
			}
		}
		LineBreak.printDoubleSpace();
	}
	
	public boolean passwordCheckPassed(String password) {
		boolean result = false;
		if(Password.equals(password)) {
			result = true;
		}
		return result;
	}
	
	public int findUserIndex(String userName) {
		int temp =0;
		for(int i = 0; i<listX.returnSizeOfList(); i++) {
			if(listX.getUser(i).equals(userName)) {
				temp = i;
			}
		}
		
		return temp;
	}
	
	
	
	
	public boolean userLoginCheck(User userName, String password) {
		boolean LoginComplete = false;
		if(listX.DoesUserExsist(userName.getName()) || userName.passwordCheckPassed(password) ) {
			LoginComplete = true;
		}
		if (LoginComplete) {
			System.out.println("Login Complete");
		}
		
		return LoginComplete;
	}
	
	private String userName;
	private int age;
	private double moneyInAccount;
	private int numOfItemsAbleToBePurchased = 0;
	private String Password; 
	private UserList listX;
	
	
	
	// Private variables and methods are present to utilize storage wisely.
	
	
}

1




