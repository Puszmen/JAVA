public class StringTest1 {

    public static void main(String[] args) {

        String hello = "Hello";
        hello = hello + " World";

        long start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
            builder.append(" ");
        }
        String numbers1 = builder.toString();
        long time1 = System.nanoTime() - start;
        System.out.println(time1);

        start = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 = numbers2 + i + " ";
        }
        long time2 = System.nanoTime() - start;
        System.out.println(time2);

        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println("time2 / time1 = " + time2/time1);
    }
}
