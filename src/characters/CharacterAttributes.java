package characters;

public abstract class CharacterAttributes {
	protected int strength, speed, stamina, intelligence;
	
	public CharacterAttributes() {
		strength = 1;
		speed = 1;
		stamina = 1; // what even is stamina
		intelligence = 1;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}
