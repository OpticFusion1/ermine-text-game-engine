package characters;

import armour.FootArmour;
import armour.HandArmArmour;
import armour.HeadArmour;
import armour.LegArmour;
import attributes.Attribute;
import classes.CharacterClass;
import gameElements.Inventory;
import items.Weapon;
import races.Race;

public class ImportantCharacter extends Character {
	protected int experiencePoints, experiencePointsToNextLevel;
	protected CharacterSkills skills;
	protected Weapon equippedWeapon = null;

	protected HandArmArmour equippedHandArmArmour = null;
	protected FootArmour equippedFootArmour = null;
	protected LegArmour equippedLegArmour = null;
	protected HeadArmour equippedHeadArmour = null;
	
	public ImportantCharacter(String name, Race race, CharacterClass charClass) {
		super(name, race, charClass);
		
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
		
		Attribute level = attributes.getAttribute("level");
		level.add(1);
		experiencePointsToNextLevel = experiencePointsToNextLevel * level.getValue(); // TODO: use level and attributes to determine how much xp will be needed to level up 
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
	public HandArmArmour getEquippedHandArmArmour() {
		return equippedHandArmArmour;
	}
	public void setEquippedHandArmArmour(HandArmArmour equippedHandArmArmour) {
		this.equippedHandArmArmour = equippedHandArmArmour;
	}
	
	public FootArmour getEquippedFootArmour() {
		return equippedFootArmour;
	}
	public void setEquippedFootArmour(FootArmour equippedFootArmour) {
		this.equippedFootArmour = equippedFootArmour;
	}
	
	public LegArmour getEquippedLegArmour() {
		return equippedLegArmour;
	}
	public void setEquippedLegArmour(LegArmour equippedLegArmour) {
		this.equippedLegArmour = equippedLegArmour;
	}
	
	public HeadArmour getEquippedHeadArmour() {
		return equippedHeadArmour;
	}
	public void setEquippedHeadArmour(HeadArmour equippedHeadArmour) {
		this.equippedHeadArmour = equippedHeadArmour;
	}
	
	
	// -- SKILLS --
	public CharacterSkills getSkills() {
		return skills;
	}
	public void setSkills(CharacterSkills skills) {
		this.skills = skills;
	}
	
	
}
