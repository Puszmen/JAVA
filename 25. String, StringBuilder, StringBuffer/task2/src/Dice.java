import java.util.Random;

public class Dice {

    private static final Random RANDOM = new Random();
    private static final String[] SIDES = {
            """
             - - - - -
            |         |
            |    0    |
            |         |
             - - - - -
            """,
            """
             - - - - -
            |       0 |
            |         |
            | 0       |
             - - - - -
            """,
            """
             - - - - -
            |       0 |
            |    0    |
            | 0       |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |         |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0     0 |
            |    0    |
            | 0     0 |
             - - - - -
            """,
            """
             - - - - -
            | 0  0  0 |
            |         |
            | 0  0  0 |
             - - - - -
            """
    };

    static String roll() {
        int side = RANDOM.nextInt(SIDES.length);
        return SIDES[side];
    }
}
