
public class LoginTester {
	public static void main(String [] args) {
		UserList Server = new UserList();
		User UserOne = new User ("Burak",18,10,Server,"a");
		
		UserOne.userLoginCheck(UserOne, "a");
		
		
		
		//Make it so that the login program takes the actual name or the user name server name.
	}
	
}
