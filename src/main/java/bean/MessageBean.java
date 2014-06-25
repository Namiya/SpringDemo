package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class MessageBean implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean, ApplicationEventPublisherAware {
	private String type;
	private int number;
	private MessageContent month;
	private MessageContent date;
	private ApplicationContext context;
	private String beanName;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher publisher;
	
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
		System.out.println(this.messageSource.getMessage("MessageBeanMsg", null, "Default MessageBean Msg", null));
		MsgPrintEvent printEvent = new MsgPrintEvent(this);
		publisher.publishEvent(printEvent);
	}

	public String getType() {
		return type;
	}

	@Required
	public void setType(String type) {
		this.type = type;
	}

	@Autowired
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

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
