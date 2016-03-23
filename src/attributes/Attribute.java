package attributes;

public abstract class Attribute {
	protected final String name; // this must be unique between the attribute classes
	protected int value, maxValue;
	
	public Attribute(String name, int value) {
		this.name = name;
		this.value = value;
		maxValue = value;
	}
	
	public String getName() {
		return name;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
	public void subtract(int sub) {
		value -= sub;
		if (value < 0) {
			value = 0;
		}
	}
	public void add(int add) {
		value += add;
		if (value > maxValue) {
			value = maxValue;
		}
	}
}
