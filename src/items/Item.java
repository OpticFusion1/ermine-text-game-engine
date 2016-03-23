package items;

public abstract class Item {
	protected final String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	
	// -- NAME --
	public String getName() {
		return name;
	}
}
