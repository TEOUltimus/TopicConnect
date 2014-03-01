import java.util.Collection;
import java.util.HashSet;

/**
 * @author TEO Ultimus
 */
public class Platform {
	private static Platform singleton = null;
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
	
	public void createConnection(Topic t) {
		
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
	}
}
