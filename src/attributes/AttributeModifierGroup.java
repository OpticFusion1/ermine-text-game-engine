package attributes;

import java.util.ArrayList;
import java.util.HashMap;

public class AttributeModifierGroup {
	protected HashMap<String, ArrayList<AttributeModifier>> attributeModifiers;
	
	public AttributeModifierGroup() {
		attributeModifiers = new HashMap<String, ArrayList<AttributeModifier>>();
	}
	
	public ArrayList<AttributeModifier> getModifierList(String attributeName) {
		return attributeModifiers.get(attributeName);
	}

	public void addAttributeModifier(AttributeModifier attributeModifier) {
		ArrayList<AttributeModifier> modifierList = attributeModifiers.get(attributeModifier.getAttributeName());
		if (modifierList == null) {
			modifierList = new ArrayList<AttributeModifier>();
		}
		modifierList.add(attributeModifier);
		attributeModifiers.put(attributeModifier.getAttributeName(), modifierList);
	}
	public void removeAttributeModifier(AttributeModifier attributeModifier) {
		ArrayList<AttributeModifier> modifierList = attributeModifiers.get(attributeModifier.getAttributeName());
		if (modifierList != null) {
			modifierList.remove(attributeModifier);
			attributeModifiers.put(attributeModifier.getAttributeName(), modifierList);
		}
	}
	
	public int getAttributeValue(Attribute attribute) {
		int value = attribute.getValue();
		ArrayList<AttributeModifier> modifierList = attributeModifiers.get(attribute.getName());
		if (modifierList != null && !modifierList.isEmpty()) {
			for (AttributeModifier modifier : modifierList) {
				value += modifier.getValue();
			}
		}
		return value;
	}
}
