package skills;

import java.util.ArrayList;
import java.util.HashMap;

public class SkillModifierGroup {
	protected HashMap<String, ArrayList<SkillModifier>> skillModifiers;
	
	public SkillModifierGroup() {
		skillModifiers = new HashMap<String, ArrayList<SkillModifier>>();
	}
	
	public ArrayList<SkillModifier> getModifierList(String skillName) {
		return skillModifiers.get(skillName);
	}

	public void addSkillModifier(SkillModifier skillModifier) {
		ArrayList<SkillModifier> modifierList = skillModifiers.get(skillModifier.getSkillName());
		if (modifierList == null) {
			modifierList = new ArrayList<SkillModifier>();
		}
		modifierList.add(skillModifier);
		skillModifiers.put(skillModifier.getSkillName(), modifierList);
	}
	public void removeSkillModifier(SkillModifier skillModifier) {
		ArrayList<SkillModifier> modifierList = skillModifiers.get(skillModifier.getSkillName());
		if (modifierList != null) {
			modifierList.remove(skillModifier);
			skillModifiers.put(skillModifier.getSkillName(), modifierList);
		}
	}
	
	public int getSkillValue(Skill skill) {
		int value = skill.getLevel();
		ArrayList<SkillModifier> modifierList = skillModifiers.get(skill.getName());
		if (modifierList != null && !modifierList.isEmpty()) {
			for (SkillModifier modifier : modifierList) {
				value += modifier.getValue();
			}
		}
		return value;
	}
}
