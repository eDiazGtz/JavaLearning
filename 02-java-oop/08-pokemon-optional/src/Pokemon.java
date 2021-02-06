
public class Pokemon {
	
	//attributes
	public String name;
	public int health;
	public String type;
	private static int pokeCount;
	
	//Constructors
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		pokeCount++;
	}
	
	//Methods
	public void attackPokemon(Pokemon otherPokemon) {
		System.out.println("POW! You have punched them with all your strength!");
		otherPokemon.setHealth(otherPokemon.getHealth() - 10);
	}


	//Getters&Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
