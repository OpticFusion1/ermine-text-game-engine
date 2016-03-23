package characters;

import attributes.Health;
import attributes.Level;
import attributes.Mana;
import gameElements.Inventory;

public abstract class Character {
	protected final Health health;
	protected final Mana mana;
	protected final Level level;
	protected Inventory inventory;
	protected CharacterAttributes attributes;
	protected String name;
	
	public Character(String name) {
		inventory = new Inventory();
		attributes = new CharacterAttributes();

		health = new Health(10);
		mana = new Mana(5);
		level = new Level(0);
		
		this.name = name;
	}
	
	// -- NAME --
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// -- HEALTH/HP --
	public boolean isDead() {
		return health.getValue() <= 0;
	}
	
	public boolean subtractHealthAndCheckIfDead(int damage) {
		health.subtract(damage);
		return isDead();
	}
	
	// -- ATTRIBUTES --
	public CharacterAttributes getAttributes() {
		return attributes;
	}
	public void setAttributes(CharacterAttributes attributes) {
		this.attributes = attributes;
	}
	
	
	// -- INVENTORY --
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
