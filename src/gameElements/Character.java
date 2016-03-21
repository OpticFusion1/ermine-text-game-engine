package gameElements;

public abstract class Character {
	protected int hp;
	protected int maxHp;
	protected Inventory inventory;
	
	public Character() {
		
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	
}
