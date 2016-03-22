package items;

import java.util.Random;

// weapons and armour
public abstract class Gear extends Item {
	protected int endurance, maxEndurance; // TODO: come up with better term for how much damage gear has
	protected boolean repairable;
	protected Random rand = new Random();
	
	public Gear() {
		super();
		endurance = 10;
		maxEndurance = 10;
		repairable = true;
	}
	
	// -- ENDURANCE --
	public boolean isBroken() {
		return endurance <= 0;
	}
	
	public void fullyRestoreEndurance() {
		endurance = maxEndurance;
	}
	
	public int getEndurance() {
		return endurance;
	}
	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}
	
	public void addEndurance(int repair) {
		endurance += repair;
		if (endurance > maxEndurance) {
			endurance = maxEndurance;
		}
	}
	
	public int getMaxEndurance() {
		return maxEndurance;
	}
	public void setMaxEndurance(int maxEndurance) {
		this.maxEndurance = maxEndurance;
	}
	
	public void addMaxEndurance(int addMax) {
		if (endurance == maxEndurance) {
			endurance += addMax;
		} else {
			endurance += (int) (addMax * .3);
		}
		maxEndurance += addMax;
	}
	
	public boolean isRepairable() {
		return repairable;
	}
	public void setRepairable(boolean repairable) {
		this.repairable = repairable;
	}
	
	
}
