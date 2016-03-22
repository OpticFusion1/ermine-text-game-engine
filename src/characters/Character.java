package characters;

import gameElements.Attributes;
import gameElements.Inventory;

public abstract class Character {
	protected int hp, maxHp;
	protected int mana, maxMana;
	protected int level;
	protected Inventory inventory;
	protected Attributes attributes;
	protected String name;
	
	public Character() {
		inventory = new Inventory();
		attributes = new Attributes();
		
		maxHp = 10;
		hp = 10;
		
		maxMana = 5;
		mana = 5;
		
		level = 0;
		
		name = "Default Character Name";
	}
	
	// -- NAME --
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	// -- HEALTH/HP --
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
	
	
	// -- MANA --
	public void subtractMana(int m) {
		mana -= m;
		if (mana < 0) {
			mana = 0;
		}
	}
	public void addMana(int m) {
		mana += m;
		if (mana > maxMana) {
			mana = maxMana;
		}
	}

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
	
	
	// -- LEVEL --
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
