import java.util.*;

class ConcreteTopic implements Topic
{
	String topicName;
	
	public ConcreteTopic(String name)
	{
		this.topicName = name;	
	}

	public void alertPlatform(Message m) 
	{
		Platform.getPlatform().createConnection(m, this);
	}
	
	public boolean textMatch(String text)
	{
		if(this.topicName.equals(text))
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
}
