import java.util.Collection;
import java.util.HashSet;

/**
 * @author TEO Ultimus
 * Instance of the Project interface
 */
public class ConcreteProject implements Project{
	private Collection<User> members;
	private Collection<Topic> topics;
	
	public ConcreteProject() {
		members = new HashSet<>();
		topics = new HashSet<>();
	}
	
	public void addUser(User usr) {
		members.add(usr);
	}

	public boolean removeUser(User usr) {
		return members.remove(usr);
	}

	public void addTopic(Topic t) {
		topics.add(t);
	}

	public boolean removeTopic(Topic t) {
		return topics.remove(t);
	}

}
