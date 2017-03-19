package PokemonJsonProject.PokemonJsonProject;

public class Pokemon {
	private String name;
	private String id;
	private Skill[] eggSkills;
	
	public String getName() {
		return name;
	}
	public void setName(String ename) {
		this.name = ename;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Skill[] getEggSkills() {
		return eggSkills;
	}
	public void setEggSkills(Skill[] eggSkills) {
		this.eggSkills = eggSkills;
	}
	
	
}
