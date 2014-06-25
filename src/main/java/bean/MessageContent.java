package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MessageContent {
	private int time;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	@PostConstruct
	public void initializeMsg()
	{
		System.out.println("Initialize message content.");
	}

	@PreDestroy
	public void destroyMsg()
	{
		System.out.println("Destory message content.");
	}
}
