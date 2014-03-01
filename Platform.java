import java.util.Collection;
import java.util.HashSet;

/**
 * @author TEO Ultimus
 */
public class Platform {
	private static Platform singleton = null;
	Collection<User> users;
	
	private Platform(){
		users = new HashSet<>();
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
	}
}
