public class BattleSimulator {

    static void fight (Team team1, Team team2) {
        double team2Energy = attack (team1, team2);
        double team1Energy = attack (team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Wygrywa drużyna " + team1.getName() + " wygrywają z przewagą " +
                    energyDiff + " jednostek energii");
        } else if (energyDiff < 0) {
            System.out.println("Wygrywa drużyna " + team2.getName() + " wygrywają z przewagą " +
                    (-energyDiff) + " jednostek energii");
        } else {
            System.out.println("REMIS !! obie drużyny mają idetyczną ilość " + team1Energy + " jednostek energii");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defence = defender.defence();
        double attackPower = attack - defence;
        double energy = defender.energy();
        if (attackPower > 0) {
            double result = energy - attackPower;
            return result >= 0? result : 0;
        }
        return energy;
    }
}
