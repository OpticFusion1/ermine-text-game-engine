package characters;

import java.util.ArrayList;
import java.util.HashMap;

import attributes.Attribute;

// TODO: make "attributes" a hash with the names of the attributes as the key
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
}
