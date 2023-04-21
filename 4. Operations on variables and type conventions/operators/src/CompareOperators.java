public class CompareOperators {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println("Is X greater than Y ?");
        boolean isXGreaterThanY = x >y;
        System.out.println(isXGreaterThanY);

        boolean isXEqualsY = x == y;
        System.out.println("Is X different Y ?");
        System.out.println(isXEqualsY);
        System.out.println(!isXEqualsY);

    }
}
