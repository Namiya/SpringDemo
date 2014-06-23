import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import bean.MessageBean;


@SuppressWarnings("deprecation")
public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //".xml" file should be put under src/../resources
		MessageBean messageBean = (MessageBean) context.getBean("messagebean");
		messageBean.PrintMessage();
	}
	
	@SuppressWarnings("unused")
	private void factorySample()
	{
		Resource res = new FileSystemResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		MessageBean messageBean = (MessageBean) factory.getBean("messagebean");
	}

}
