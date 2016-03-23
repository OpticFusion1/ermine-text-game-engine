package characters;

import attributes.AttributeModifierGroup;

public abstract class CharacterDescriptor extends AttributeModifierGroup {
	protected final String name;
	protected final String description;
	
	public CharacterDescriptor(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
}
