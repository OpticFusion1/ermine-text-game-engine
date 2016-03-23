package characters;

import java.util.HashMap;

import attributes.Attribute;

public class CharacterAttributes {
	protected HashMap<String, Attribute> attributes;
	
	public CharacterAttributes() {
		attributes = new HashMap<String, Attribute>();
	}
	
	public Attribute getAttribute(String attributeName) {
		return attributes.get(attributeName);
	}

	public void addAttribute(Attribute attribute) {
		attributes.put(attribute.getName(), attribute);
	}
	public void removeAttribute(String attributeName) {
		attributes.remove(attributeName);
	}
	public void removeAttribute(Attribute attribute) {
		removeAttribute(attribute.getName());
	}
	
	public void setAttributeValue(String attributeName, int value) {
		attributes.get(attributeName).setValue(value);
	}
	
	public boolean attributeExists(String attributeName) {
		return getAttribute(attributeName) != null;
	}
}
