package data;

public class UnitConversion {
    private final static double GLASS_TO_ML = 250;
    private final static double BIG_SPOON_TO_ML = 15;
    private final static double SMALL_SPOON_TO_ML = 5;

    public static double glassCounter (double glass) {
        return glass * GLASS_TO_ML;
    }

    public static double bigSpoonCounter (double spoon) {
        return spoon * BIG_SPOON_TO_ML;
    }

    public static double smallSpoonCounter (double spoon) {
        return spoon * SMALL_SPOON_TO_ML;
    }

}
