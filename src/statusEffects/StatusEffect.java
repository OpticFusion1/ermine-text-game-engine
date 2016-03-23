package statusEffects;

import java.util.ArrayList;

import attributes.AttributeModifier;
import attributes.AttributeModifierGroup;

public abstract class StatusEffect {
	protected final String name;
	protected AttributeModifierGroup modifiers;
	
	public StatusEffect(String name) {
		this.name = name;
		modifiers = new AttributeModifierGroup();
	}
	
	public String getName() {
		return name;
	}

	public AttributeModifier getModifier(String attributeName) {
		return modifiers.getModifier(attributeName);
	}
}
