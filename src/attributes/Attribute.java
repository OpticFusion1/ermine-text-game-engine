package attributes;

public abstract class Attribute {
	protected String name;
	protected int value;
	
	public Attribute() {
		name = "Default Attribute Name";
		value = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
