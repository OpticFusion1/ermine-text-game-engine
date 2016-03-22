package gameElements;

public class Attributes {
	protected int strength, speed, stamina, intelligence;
	
	public Attributes() {
		strength = 1;
		speed = 1;
		stamina = 1;
		intelligence = 1;
	}
	
	// -- getters & setters --
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
