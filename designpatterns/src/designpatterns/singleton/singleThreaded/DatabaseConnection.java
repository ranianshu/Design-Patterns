package designpatterns.singleton.singleThreaded;

public class DatabaseConnection {
	
	private DatabaseConnection() {
		
	}
	
	private static DatabaseConnection instance = null;
	
	public DatabaseConnection getInstance() {
		if(instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}

}
