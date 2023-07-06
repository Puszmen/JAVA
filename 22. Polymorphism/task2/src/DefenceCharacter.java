public class DefenceCharacter extends GameCharacter {

    private double bonusDefence;

    public DefenceCharacter(String teamName, int teamEnergy, int attackPower, int defencePower, double bonusDefence) {
        super(teamName, teamEnergy, attackPower, defencePower);
        this.bonusDefence = bonusDefence;
    }

    public double getBonusDefence() {
        return bonusDefence;
    }

    public void setBonusDefence(double bonusDefence) {
        this.bonusDefence = bonusDefence;
    }

    @Override
    public double totalDefence() {
        return getDefencePower() + (getDefencePower() * bonusDefence);
    }
}
