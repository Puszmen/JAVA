public class Team {

    private String name;
    private GameCharacter[] gameCharacters = new GameCharacter[3];

    public Team(String name, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.name = name;
        this.gameCharacters[0] = character1;
        this.gameCharacters[1] = character2;
        this.gameCharacters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter[] getGameCharacters() {
        return gameCharacters;
    }

    public void setGameCharacters(GameCharacter[] gameCharacters) {
        this.gameCharacters = gameCharacters;
    }

    double attack () {
        double attack = 0;
        for (GameCharacter character : gameCharacters) {
            attack += character.totalAttack();
        }
        return attack;
    }

    double defence () {
        double defence = 0;
        for (GameCharacter character : gameCharacters) {
            defence += character.totalDefence();
        }
        return defence;
    }

    double energy () {
        double energy = 0;
        for (GameCharacter character : gameCharacters) {
            energy += character.getTeamEnergy();
        }
        return energy;
    }

}
