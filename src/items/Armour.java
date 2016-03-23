package items;

public abstract class Armour extends Gear {
	protected int rating;
	
	public Armour() {
		super();
		rating = 0;
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
}
