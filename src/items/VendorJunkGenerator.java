package items;

import java.util.Random;

public class VendorJunkGenerator {
	private final String[] junkNameList = {"Used Rag", "Neat Stick", "Dirty Patch Of Fur", "Broken Knife", "Dull Spoon"};
	private final int minimumPrice = 1;
	private final int maximumPrice = 4;
	private final Random random = new Random();
	
	public VendorJunkGenerator() {}
	
	public VendorJunk makeNewVendorJunk() {
		int nameIndex = random.nextInt(junkNameList.length - 1);
		int price = random.nextInt(maximumPrice) + minimumPrice;
		return new VendorJunk(junkNameList[nameIndex], price);
	}
}
