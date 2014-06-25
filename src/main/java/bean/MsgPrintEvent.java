package bean;

import org.springframework.context.ApplicationEvent;

public class MsgPrintEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MsgPrintEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		return "===============Print Event Message====================";
	}

}
