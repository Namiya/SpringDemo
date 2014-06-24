package bean;

public class MessageBean {
	private String type;
	private int number;
	private MessageContent month;
	private MessageContent date;

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



/*	public void setType(String type) {
		this.type = type;
	}*/

}
