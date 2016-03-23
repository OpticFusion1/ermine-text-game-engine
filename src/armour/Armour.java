package armour;

import items.Gear;

public abstract class Armour extends Gear {
	protected final int rating;
	
	public Armour(String name, int rating) {
		super(name);
		this.rating = rating;
	}
	
	// TODO: write better algorithm
	public int getNewAttackDamage(int attackDamage) {
		if (rating == 0 || attackDamage == 0) {
			return attackDamage;
		}
		
		int random = rand.nextInt(rating);
		int newAttackDamage = attackDamage - random;
		
		// ensure that an attack will always do some damage
		if (newAttackDamage <= 0) {
			newAttackDamage = 1;
		}
		
		return newAttackDamage;
	}
	
	public int getRating() {
		return rating;
	}
}
