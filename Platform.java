import java.util.Collection;
import java.util.HashSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.*;
import java.net.*;


// Not importing com.mysql.jdbc, documentation says this leads to sadness

/**
 * @author TEO Ultimus
 */
public class Platform {
	private static Platform singleton = null;
	public static Connection SQLconn = null;
	Collection<User> admins;
	Collection<User> users;
	Collection<Topic> topics;
	Collection<Project> projects;
	
	private Platform(){
		users = new HashSet<>();
		topics = new HashSet<>();
		projects = new HashSet<>();
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
	
	public void createConnection(User admin, Message m, Topic t) {
		Connect c =
				new ConcreteConnect(admin, m.getSender(), m.getRecipient());
		c.alertUser(t);
	}
	
	public Collection<Topic> getTopics() {
		return topics;
	}
	
	/**
	 * Allows users to find other users talking about similar topics
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello Users!");
		getPlatform().establishDBConnection();
		getPlatform().testSQL();
		
		
		Platform testPlatform = new Platform();
	}
	
	public void establishDBConnection(){
	    // Bad practice, but we're bad people
/*	    Class cls = null; // persistance 
	    try{
            File file = new File("mysql-connector-java-5.1.29-bin.jar");
            URL url = file.toURL();
            URL[] urls = new URL[]{url};
            ClassLoader cl = new URLClassLoader(urls);
            cls = cl.loadClass("com.mysql.jdbc.Driver");
        }
        catch(Exception ex){
            System.out.println("File not found -- " + ex);
        }
	    
*/	
        String sqlconnstring = "jdbc:mysql://mylanhack.coktmzoprhqd.us-west-2.rds.amazonaws.com/mylanhack?" +
                                   "user=mylanroot&password=mylantoor";
		
		// Establish Database Connection
		try{
		    Class.forName("com.mysql.jdbc.Driver");
		    SQLconn = DriverManager.getConnection(sqlconnstring);
		}
		catch(Exception ex){
		    System.out.println("Database connection went bad -- " + ex);
		    System.exit(0); //no DB, don't bother running
		}
		System.out.println("Established DB connection!");
		
	}
	
	public ResultSet runSQL(String SQL){
	    System.out.println("Query Request:\n"+SQL+"\n");
	    Statement stmt = null;
	    ResultSet rs = null;
	    
	    try{
	        stmt = SQLconn.createStatement();
	        if (stmt.execute(SQL)){
	            rs = stmt.getResultSet();
	        }
	        return rs;
	    }
	    catch (SQLException ex){
	        // well fuck
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
	    }
        finally{
            // cleanup
            if (rs != null){
                try { rs.close(); } catch (SQLException sqlEx) {}
                rs = null;
            }
            if (stmt != null){
                try{ stmt.close(); } catch(SQLException sqlEx){}
                stmt = null;
            }
        }
        
        return rs;
	}
	
	public void testSQL(){
	    System.out.println("TESTING SQL -- DO NOT INCLUDE");
	    ResultSet rs = getPlatform().runSQL("SELECT * FROM Users");
	    
	    System.out.println(rs.getClass());
	    try{
    	    System.out.println(rs.getString("first_name"));
    	} catch(SQLException ex){
    	    System.out.println(ex);
    	}
	}
}
