package items;

// its only use is to sell for chump change
public class VendorJunk extends Item {
	public VendorJunk(String name, int sellPrice) {
		super(name);
		this.sellPrice = sellPrice;
	}
}
