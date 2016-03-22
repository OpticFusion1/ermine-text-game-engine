package gameElements;

public abstract class Character {
	protected int hp, maxHp;
	protected int mana, maxMana;
	protected Inventory inventory;
	protected Attributes attributes;
	
	public Character() {
		inventory = new Inventory();
		attributes = new Attributes();

		maxHp = 10;
		hp = 10;
		
		maxMana = 5;
		mana = 5;
	}
	
	public void subtractHealth(int damage) {
		hp -= damage;
		if (hp < 0) {
			hp = 0;
		}
	}
	public void addHealth(int heal) {
		hp += heal;
		if (hp > maxHp) {
			hp = maxHp;
		}
	}
	
	public boolean isDead() {
		return hp <= 0;
	}
	
	public boolean subtractHealthAndCheckIfDead(int damage) {
		subtractHealth(damage);
		return isDead();
	}
	
	
	// -- getters & setters
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public int getMaxMana() {
		return maxMana;
	}
	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}
	
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getHp() {
		return hp;
	}
}
