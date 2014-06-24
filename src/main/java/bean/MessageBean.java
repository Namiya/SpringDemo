package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageBean implements ApplicationContextAware, BeanNameAware{
	private String type;
	private int number;
	private MessageContent month;
	private MessageContent date;
	private ApplicationContext context;

	public MessageContent getMonth() {
		return month;
	}

	public void setMonth(MessageContent month) {
		this.month = month;
	}

	public MessageContent getDate() {
		return date;
	}

	public void setDate(MessageContent date) {
		this.date = date;
	}

	public int getNumber()
	{
		return number;
	}
	
	public MessageBean(String type)
	{
		this.type = type;
	}
	
	public MessageBean(String type, int number)
	{
		this.type = type;
		this.number = number;
	}
	
	public void PrintMessage()
	{
		System.out.println(getType() + "time " + getNumber() + "/" + getMonth().getTime() + "/" + getDate().getTime());
	}

	public String getType() {
		return type;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name: " + name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}



/*	public void setType(String type) {
		this.type = type;
	}*/

}
