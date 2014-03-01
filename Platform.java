import java.util.Collection;
import java.util.HashSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


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
	
	public void createConnection(Message m, Topic t) {
		Connect c =
				new ConcreteConnect(admins.iterator().next(), m.getSender(), m.getRecipient());
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
		establishDBConnection();
		
		Platform testPlatform = new Platform();
		
		//Make test lists of users, topics, and projects
		User David = new User("David");
		User Eric = new User("Eric");
		User Brandon = new User("Brandon");
		User Sudatta = new User("Sudatta");
		User Dan = new User("Dan");
		Dan.setPrivilege(true);
		testPlatform.users.add(David);
		testPlatform.users.add(Eric);
		testPlatform.users.add(Brandon);
		testPlatform.users.add(Sudatta);
		testPlatform.users.add(Dan);
		
		Topic Biologics = new Topic("Biologics");
		Topic Generics = new Topic("Generics");
		Topic Hackathons = new Topic("Hackathons");
		testPlatform.topics.add(Biologics);
		testPlatform.topics.add(Generics);
		testPlatform.topics.add(Hackathons);
		
		Project marchHackathon = new project();
		Project worldDomination = new project();
		marchHackathon.addTopic(Hackathons);
		worldDomination.addTopic(Generics);
		worldomination.addTopic(Biologics);
		marchHackathon.addUser(David);
		marchHackathon.addUser(Eric);
		worldDomination.addUser(Sudatta);
		testPlatform.projects.add(marchHackathon);
		testPlatform.projects.add(worldDomination);
		
		David.sendMessage(Brandon, "Been working out the kinks with worldDomination in my spare time, had some ideas...");
		
		
		
		
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
	
	public ResultSet runSQL(String SQL){
	    Statement stmt = null;
	    ResultSet rs = null;
	    
	    try{
	        stmt = SQLconn.createStatement();
	        if (stmt.execute(SQL)){
	            rs = stmt.getResultSet();
	        }
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
}
