public class Tester {
	public static void main(String [] args) {
	
		//Adding users and created a server to store users
		UserList Server = new UserList();
		User UserOne = new User ("Burak",18,10,Server,"a");
		User UserTwo = new User ("Ismail",42,2000,Server,"b");
		User UserThree = new User ("Melike",23,100000,Server,"c");
		User UserFour = new User ("Yasemin",23,99,Server,"d");
		
		//Testing server methods
		Server.returnUsers();
		Server.returnUsersAndInformation();	
		
		//Created a Server that stores items and added 5 items
		 ItemList ItemServer = new ItemList();
		 Item ItemOne = new Item("Coffee" , 7, ItemServer);
		 Item ItemTwo = new Item("Ipad" , 700, ItemServer);
		 Item ItemThree = new Item("Iphone 6s" ,100 , ItemServer);
		 Item ItemFour = new Item("Pillow" , 49, ItemServer);
		 Item ItemFive = new Item("Car" , 100000, ItemServer);
		 
		 //Testing purchasing power method
		 
		UserOne.purchasingPower(ItemServer);
		
		//Testing User List purchasing power method
		
		Server.returnUsersPurchasingPower(ItemServer);
		
		//Printing out default values of 
		//Testing percent Increase
		ItemServer.PercentIncreaseAll(5);
		ItemServer.returnEachItemsInfo();
		
		//Testing percent off Method
		ItemServer.percentOffAll(5);
		ItemServer.returnEachItemsInfo();
		
		//Testing reset method
		
		ItemServer.ResetInfoToDefault();
		ItemServer.returnEachItemsInfo();
		
	}
}
