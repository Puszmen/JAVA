class NumberPrinter {
    void numberPrinter(int a) {
        System.out.println(a);
    }
    void numberPrinter(int a, int b) {
        numberPrinter(a);
        System.out.println(b);
    }
    void numberPrinter(int a, int b, int c) {
        numberPrinter(a, b);
        System.out.println(c);
    }
}
