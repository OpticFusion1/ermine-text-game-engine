package statusEffects;

import java.util.ArrayList;

import attributes.AttributeModifier;

public abstract class StatusEffect {
	protected String name;
	protected ArrayList<AttributeModifier> modifiers;
	
	public StatusEffect() {
		name = "Default Status Effect Name";
		modifiers = new ArrayList<AttributeModifier>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<AttributeModifier> getModifiers() {
		return modifiers;
	}
	public void setModifiers(ArrayList<AttributeModifier> modifiers) {
		this.modifiers = modifiers;
	}
}
