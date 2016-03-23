package skills;

public abstract class Skill {
	protected String name;
	protected int level;
	
	public Skill() {
		name = "Default Skill Name";
		level = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
