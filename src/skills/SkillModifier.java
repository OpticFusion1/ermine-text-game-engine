package skills;

public abstract class SkillModifier {
	protected final String skillName;
	protected final String displayName;
	protected final int value;
	
	public SkillModifier(String displayName, String skillName, int value) {
		this.value = value;
		this.skillName = skillName;
		
		if (displayName != null && !displayName.trim().equals(""))
			this.displayName = displayName;
		else {
			StringBuilder builder = new StringBuilder();
			builder.append(skillName+" ");
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
	public String getSkillName() {
		return skillName;
	}
	public int getValue() {
		return value;
	}
	
}
