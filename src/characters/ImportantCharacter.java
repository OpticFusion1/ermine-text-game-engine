package characters;

import armour.Armour;
import armour.FootArmour;
import armour.HandArmArmour;
import armour.HeadArmour;
import armour.LegArmour;
import items.Weapon;
import skills.Skill;

public class ImportantCharacter extends Character {
	protected int experiencePoints, experiencePointsToNextLevel;
	protected CharacterSkills skills;
	protected Weapon equippedWeapon = null;

	protected HandArmArmour equippedHandArmArmour = null;
	protected FootArmour equippedFootArmour = null;
	protected LegArmour equippedLegArmour = null;
	protected HeadArmour equippedHeadArmour = null;
	
	public ImportantCharacter() {
		super();
		
		skills = new CharacterSkills();
		experiencePointsToNextLevel = 100;
		experiencePoints = 0;
	}
	
	// -- LEVEL/EXPERIENCE POINTS --
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
	
	
	// -- WEAPON --
	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}
	public void setEquippedWeapon(Weapon equippedWeapon) {
		this.equippedWeapon = equippedWeapon;
	}
	
	
	// -- ARMOUR --
	public Armour getEquippedArmour() {
		return equippedArmour;
	}
	public void setEquippedArmour(Armour equippedArmour) {
		this.equippedArmour = equippedArmour;
	}
	
	
	// -- SKILLS --
	public CharacterSkills getSkills() {
		return skills;
	}
	public void setSkills(CharacterSkills skills) {
		this.skills = skills;
	}
	
	
}
