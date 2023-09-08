public class WrapperTypes {
    /*
    byte - Byte
    short - Short
    int - Integer
    float - Float
    double - Double
    char - Character
    boolean - Boolean
     */

    public static void main(String[] args) {

//        Integer value1 = 123; // auto boxing Integer.valueOf("123");
//        Double value2 = 23.5; // auto boxing Double.valueOf("23.5");
//
//        int vvalue1 = value1; // auto unboxing value1.intValue();
//        double vvalue2 = value2; // auto unboxing value2.doubleValue();
//
//        Object ref = Integer.valueOf(123);
//        Object[] refs = {"abs", 132, 25.5};
//        String numberStr = "28";
//        int value = Integer.parseInt(numberStr);

        Integer value1 = Integer.valueOf(128);
        Integer value2 = Integer.valueOf(128);

        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));
    }
}
