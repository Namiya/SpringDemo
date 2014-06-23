package bean;

public class MessageBean {
	private String type;
	
	public void PrintMessage()
	{
		System.out.println(getType() + "hello world");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
