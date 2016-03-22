package items;

public abstract class Weapon extends Gear {
	protected int minimumDamage, maximumDamage;
	
	public Weapon() {
		super();
		minimumDamage = 0;
		maximumDamage = 1;
	}
	
	
	// -- DAMAGE --
	public int getAttackDamage() {
		return rand.nextInt(maximumDamage) + minimumDamage;
	}
	
	public int getMinimumDamage() {
		return minimumDamage;
	}
	public void setMinimumDamage(int minimumDamage) {
		this.minimumDamage = minimumDamage;
	}
	
	public int getMaximumDamage() {
		return maximumDamage;
	}
	public void setMaximumDamage(int maximumDamage) {
		this.maximumDamage = maximumDamage;
	}
	
	
	
	
	
}
