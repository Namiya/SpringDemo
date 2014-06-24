package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageBean implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{
	private String type;
	private int number;
	private MessageContent month;
	private MessageContent date;
	private ApplicationContext context;
	private String beanName;
	
	public MessageBean()
	{
		
	}

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

	public void setType(String type) {
		this.type = type;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public void setBeanName(String name) {
		beanName = name;
		System.out.println("Bean Name: " + name);
		
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(beanName + ": DisposableBean destroy method called.");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(beanName + ":InitalizingBean init method called.");
		
	}

	public void myInit()
	{
		System.out.println(beanName + "'s Init method.");
	}
	
	public void clearUp()
	{
		System.out.println(beanName + "'s cleanUp method.");
	}

}
