import java.util.Collection;
import java.util.HashSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


// Not importing com.mysql.jdbc, documentation says this leads to sadness

/**
 * @author TEO Ultimus
 */
public class Platform {
	private static Platform singleton = null;
	public static Connection SQLconn = null;
	Collection<User> users;
	
	private Platform(){
//		users = new HashSet<>();
	}
	
	public static Platform getPlatform() {
		if (null == singleton) {
			singleton = new Platform();
		}
		return singleton;
	}
	
	public Collection<User> getUsers() {
		return users;
	}
	
	public void createConnection(Topic t) {
		
	}
	
	/**
	 * Allows users to find other users talking about similar topics
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello Users!");
		establishDBConnection();
		
	}
	
	public static void establishDBConnection(){
        String sqlconnstring = "jdbc:mysql://mylanhack.coktmzoprhqd.us-west-2.rds.amazonaws.com/mylanhack?" +
                                   "user=mylanroot&password=mylantoor";
		
		// Establish Database Connection
		try{
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    SQLconn = DriverManager.getConnection(sqlconnstring);
		}
		catch(Exception ex){
		    System.out.println("Database connection went bad -- " + ex);
		}
	}
	
	public void 
}
