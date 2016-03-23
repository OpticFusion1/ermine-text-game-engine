package attributes;

import java.util.HashMap;

public class AttributeModifierGroup {
	protected HashMap<String, AttributeModifier> attributeModifiers;
	
	public AttributeModifierGroup() {
		attributeModifiers = new HashMap<String, AttributeModifier>();
	}
	
	public AttributeModifier getModifier(String attributeName) {
		return attributeModifiers.get(attributeName);
	}
	
}
