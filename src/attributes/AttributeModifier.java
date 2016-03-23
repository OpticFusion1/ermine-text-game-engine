package attributes;

// TODO: figure out how this works
// the idea: have a status effect called "Stallion Heart"
//   Stallion Heart increases strength by 1 and speed by 2
//   one AttributeModifier would link +1 to strength and another one would link +2 to speed
//   the AttributeModifiers would be encapsulated by the StatusEffect

public abstract class AttributeModifier {
	protected final String attributeName;
	protected final int value;
	
	public AttributeModifier(String attributeName, int value) {
		this.value = value;
		this.attributeName = attributeName;
	}
	
	public String getAttributeName() {
		return attributeName;
	}
	public int getValue() {
		return value;
	}
	
}
