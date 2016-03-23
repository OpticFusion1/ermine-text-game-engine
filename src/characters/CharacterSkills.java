package characters;

import java.util.ArrayList;

import skills.Skill;

public class CharacterSkills {
	protected ArrayList<Skill> skills;
	
	public CharacterSkills() {
		skills = new ArrayList<Skill>();
	}
	
	public ArrayList<Skill> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}
	
	public void addSkill(Skill skill) {
		skills.add(skill);
	}
	public void removeSkill(Skill skill) {
		skills.remove(skill);
	}
}
