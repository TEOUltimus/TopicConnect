import java.util.*;

class ConcreteTopic implements Topic
{
	String topicName;
	User administrator = null;
	
	public ConcreteTopic(String name, User admin)
	{
		this.topicName = name;
		if (admin.isPrivleged()) administrator = admin;
	}

	public void alertPlatform(Message m) {
		Platform.getPlatform().createConnection(administrator, m, this);
	}
	
	public boolean setAdmin(User admin) {
		if (admin.isPrivleged()) {
			administrator = admin;
			return true;
		}
		return false;
	}
	
	public boolean textMatch(String text) {
		return text.contains(this.topicName);
	}
}
