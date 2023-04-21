public class LogicalOperators {
    public static void main(String[] args) {

        int x = 5;
        int y = -10;

        System.out.println("Is X smaller than 0 and (in the same time) is Y greater than 0 ?");
        System.out.println(x < 0);
        System.out.println(y > 0);
        System.out.println(x < 0 && y > 0);
        // || - alternative = or
        // && - conjunction - and

        System.out.println(true || false && false);
    }
}
