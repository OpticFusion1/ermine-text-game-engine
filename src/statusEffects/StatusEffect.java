package statusEffects;

import attributes.AttributeModifierGroup;

public abstract class StatusEffect extends AttributeModifierGroup {
	protected final String name;
	
	public StatusEffect(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
