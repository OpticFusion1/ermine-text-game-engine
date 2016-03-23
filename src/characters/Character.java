package characters;

import attributes.Attribute;
import attributes.AttributeModifier;
import attributes.AttributeModifierGroup;
import classes.CharacterClass;
import gameElements.Inventory;
import races.Race;

public abstract class Character {
	protected Inventory inventory;
	protected CharacterAttributes attributes;
	protected AttributeModifierGroup attributeModifiers;
	protected String name;
	protected final Race race;
	protected final CharacterClass charClass;
	
	public Character(String name, Race race, CharacterClass charClass) {
		this.charClass = charClass;
		this.race = race;
		this.name = name;
		
		inventory = new Inventory();
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
		return getAttribute("health").getValue() <= 0;
	}
	
	public boolean subtractHealthAndCheckIfDead(int damage) {
		getAttribute("health").subtract(damage);
		return isDead();
	}
	
	// -- ATTRIBUTES --
	public Attribute getAttribute(String attributeName) {
		return attributes.getAttribute(attributeName);
	}
	public void addAttribute(Attribute attribute) {
		attributes.addAttribute(attribute);
	}
	public void removeAttribute(Attribute attribute) {
		attributes.removeAttribute(attribute);
	}
	public void setAttributeValue(String attributeName, int value) {
		attributes.setAttributeValue(attributeName, value);
	}
	
	
	// -- INVENTORY --
	public Inventory getInventory() {
		return inventory;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
