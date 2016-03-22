package items;

public abstract class Armour extends Gear {
	protected int rating;
	
	public Armour() {
		super();
		rating = 0;
	}
	
	public int getNewAttackDamage(int attackDamage) { // TODO: write better algorithm
		if (rating == 0) {
			return 0;
		}
		
		int random = rand.nextInt(rating);
		if (random >= attackDamage) {
			return 1;
		} else {
			return random;
		}
	}
}
