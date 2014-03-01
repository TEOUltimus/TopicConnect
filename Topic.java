/**
 * @author TEO Ultimus
 * Trendy topic of project or conversation
 */
public interface Topic {
	void alertPlatform(Message m);
	boolean textMatch(String text);
}
