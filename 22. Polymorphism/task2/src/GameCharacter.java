public class GameCharacter {

    private String teamName;
    private int teamEnergy;
    private int attackPower;
    private int defencePower;

    public GameCharacter(String teamName, int teamEnergy, int attackPower, int defencePower) {
        this.teamName = teamName;
        this.teamEnergy = teamEnergy;
        this.attackPower = attackPower;
        this.defencePower = defencePower;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamEnergy() {
        return teamEnergy;
    }

    public void setTeamEnergy(int teamEnergy) {
        this.teamEnergy = teamEnergy;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    public double totalAttack () {
        return attackPower;
    }

    public double totalDefence () {
        return defencePower;
    }
}
