package bean;

public class MessageBean {
	private String type;
	private int number;

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
		System.out.println(getType() + "time " + getNumber() );
	}

	public String getType() {
		return type;
	}

/*	public void setType(String type) {
		this.type = type;
	}*/

}
