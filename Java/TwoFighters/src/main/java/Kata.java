public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        boolean turn = fighter1.name == firstAttacker;
        while (true) {
            if (turn) {
                // fighter1 attacks
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name;
                }
            } else {
                // fighter2 attacks
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name;
                }
            }
            turn = !turn;
        }
    }
}