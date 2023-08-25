public class CompareNumbers {
    public static void main(String[] args) {

        int[] tab = {1, 16, -9, 1325, 1258, -23, -68452, 384};

        BiggestNumber bg = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] tab) {
                if (tab == null)
                throw new NullPointerException("argument cannot be null");
                if (tab.length == 0)
                throw new IllegalArgumentException("array has to have at least one value");

                int biggestNumber = tab[0];
                for (int i = 0; i < tab.length; i++) {
                    if (biggestNumber < tab[i]) {
                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };

        System.out.println("Największa liczba w tablicy to: " + bg.takeBiggest(tab));
    }
}
