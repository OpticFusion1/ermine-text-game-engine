package classes;

import java.util.ArrayList;

import attributes.AttributeModifier;

public abstract class CharacterClass {
	protected final String name;
	protected ArrayList<AttributeModifier> attributeModifiers;
	
	public CharacterClass(String name) {
		this.name = name;
		attributeModifiers = new ArrayList<AttributeModifier>();
	}
	
	public String getName() {
		return name;
	}
}
