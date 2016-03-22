package gameElements;

public abstract class Character {
	protected int hp, maxHp;
	protected int mana, maxMana;
	protected int level, experiencePoints, experiencePointsToNextLevel;
	protected Inventory inventory;
	protected Attributes attributes;
	
	public Character() {
		inventory = new Inventory();
		attributes = new Attributes();

		maxHp = 10;
		hp = 10;
		
		maxMana = 5;
		mana = 5;
		
		experiencePointsToNextLevel = 100;
		experiencePoints = 0;
		level = 0;
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
	
	public boolean readyToLevelUp() {
		return experiencePoints >= experiencePointsToNextLevel;
	}
	
	public void levelUp() {
		if (experiencePoints > experiencePointsToNextLevel) {
			experiencePoints -= experiencePointsToNextLevel;
		} else {
			experiencePoints = 0;
		}
		
		level++;
		experiencePointsToNextLevel = experiencePointsToNextLevel * level; // TODO: use level and attributes to determine how much xp will be needed to level up 
	}
	
	
	// -- EXPERIENCE POINTS --
	public int getExperiencePoints() {
		return experiencePoints;
	}
	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public void addExperiencePoints(int xp) {
		experiencePoints += xp;
	}
	public void subtractExperiencePoints(int xp) {
		experiencePoints -= xp;
	}
	
	public int getExperiencePointsToNextLevel() {
		return experiencePointsToNextLevel;
	}
	public void setExperiencePointsToNextLevel(int experiencePointsToNextLevel) {
		this.experiencePointsToNextLevel = experiencePointsToNextLevel;
	}
	
	
	
	
}
