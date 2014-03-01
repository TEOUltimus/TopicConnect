import java.util.Collection;

/**
 * @author TEO Ultimus
 */
public class Platform {
	private static Platform singleton = null;
	
	private Platform(){
	}
	
	public static Platform getPlatform() {
		if (null == singleton) {
			singleton = new Platform();
		}
		return singleton;
	}
	
	public Collection<User> getUsers() {
		return null;
	}
	
	/**
	 * Allows users to find other users talking about similar topics
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello Users!");
	}
}
