package Polimorfizm.cw2;



public class Team{
    private String name;
    private GameCharacter[] characters = new GameCharacter[3];

    public Team(String name, GameCharacter character2, GameCharacter character3, GameCharacter character1) {
        this.name = name;
        this.characters[0] = character1;
        this.characters[1] = character2;
        this.characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter[] getCharacters() {
        return characters;
    }

    public void setCharacters(GameCharacter[] characters) {
        this.characters = characters;
    }

    double attack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    double defense() {
        double defense = 0;
        for (GameCharacter character : characters) {
            defense += character.totalDefense();
        }
        return defense;
    }

    double energy() {
        double energy = 0;
        for (GameCharacter character : characters) {
            energy += character.getEnergy();
        }
        return energy;
    }
}