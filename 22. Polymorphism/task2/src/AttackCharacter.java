public class AttackCharacter extends GameCharacter {

    private double bonusAttack;

    public AttackCharacter(String teamName, int teamEnergy, int attackPower, int defencePower, double bonusAttack) {
        super(teamName, teamEnergy, attackPower, defencePower);
        this.bonusAttack = bonusAttack;
    }

    public double getBonusAttack() {
        return bonusAttack;
    }

    public void setBonusAttack(double bonusAttack) {
        this.bonusAttack = bonusAttack;
    }

    @Override
    public double totalAttack() {
        return getAttackPower() + (getAttackPower() * bonusAttack);
    }
}
