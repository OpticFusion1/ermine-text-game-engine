package items;

public abstract class Item {
	protected final String name;
	protected int sellPrice;
	
	public Item(String name) {
		this.name = name;
		sellPrice = 0;
	}
	
	
	// -- NAME --
	public String getName() {
		return name;
	}
	
	// -- SELL PRICE --
	public int getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}
	
}
