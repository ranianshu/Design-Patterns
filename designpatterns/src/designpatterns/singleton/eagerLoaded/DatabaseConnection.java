package designpatterns.singleton.eagerLoaded;

public class DatabaseConnection {
	
	private DatabaseConnection() {
		
	}
	
	private static DatabaseConnection instance = new DatabaseConnection();
	
	public static DatabaseConnection getInstance() {
		return instance;
	}

}
