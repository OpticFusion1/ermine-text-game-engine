package items;

public abstract class Item {
	protected String name;
	
	public Item() {
		name = "Default Item Name";
	}
	
	
	// -- NAME --
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
