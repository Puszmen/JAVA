public class GameSimulator {

    public static void main(String[] args) {

        AttackCharacter character1 = new AttackCharacter("Kinga",
                100,100,100,0.8);
        AttackCharacter character2 = new AttackCharacter("Pit",
                100,100,100,0.2);
        DefenceCharacter character3 = new DefenceCharacter("Łotr",
                100,100,100,0.2);

        AttackCharacter character4 = new AttackCharacter("Leszcz",
                100,100,100,0.2);
        AttackCharacter character5 = new AttackCharacter("Kleszcz",
                100,100,100,0.2);
        DefenceCharacter character6 = new DefenceCharacter("Chłop",
                100,100,100,0.2);

        Team team1 = new Team("Miszcze",character1,character2,character3);
        Team team2 = new Team("Łajzy",character4,character5,character6);

        BattleSimulator.fight(team1,team2);
    }
}
