package characters;

import java.util.ArrayList;

import attributes.Attribute;

public class CharacterAttributes {
	protected ArrayList<Attribute> attributes;
	
	public CharacterAttributes() {
		attributes = new ArrayList<Attribute>();
	}
	
	public ArrayList<Attribute> getAttributes() {
		return attributes;
	}
	public void setAttributes(ArrayList<Attribute> attributes) {
		this.attributes = attributes;
	}

	public void addAttribute(Attribute attribute) {
		attributes.add(attribute);
	}
	public void removeAttribute(Attribute attribute) {
		attributes.remove(attribute);
	}
}
