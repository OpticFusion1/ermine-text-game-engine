package attributes;

// TODO: figure out how this works
// the idea: have a status effect called "Stallion Heart"
//   Stallion Heart increases strength by 1 and speed by 2
//   one SkillModifier would link +1 to strength and another one would link +2 to speed
//   the AttributeModifiers would be encapsulated by the StatusEffect

public abstract class AttributeModifier {
	protected final String attributeName;
	protected final String displayName;
	protected final int value;
	
	public AttributeModifier(String displayName, String attributeName, int value) {
		this.value = value;
		this.attributeName = attributeName;
		
		if (displayName != null && !displayName.trim().equals(""))
			this.displayName = displayName;
		else {
			StringBuilder builder = new StringBuilder();
			builder.append(attributeName+" ");
			if (value >= 0)
				builder.append("+");
			else
				builder.append("-");
			builder.append(value);
			this.displayName = builder.toString();
		}
	}

	public String getDisplayName() {
		return displayName;
	}
	public String getAttributeName() {
		return attributeName;
	}
	public int getValue() {
		return value;
	}
	
}
