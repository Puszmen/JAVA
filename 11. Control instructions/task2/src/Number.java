public class Number {
    void compareNumber(int number, int directNumber) {
        if (number < directNumber) {
            System.out.println("Liczba " + number + " jest mniejsza od 5000");
        } else if (number == 5000) {
            System.out.println("Wylosowana liczba jest równa 5000: " + number);
        } else {
            System.out.println("Liczba " + number + " jest większa od 5000");
        }
    }
    void evenNumber (int number) {
        if (number % 2 == 0) {
            System.out.println("Liczba "+number+" jest parzysta");
        } else {
            System.out.println("Liczba "+number+" jest nieparzysta");
        }
    }
    int countNumber (int number) {
        if (number == 0) {
            return 0;
        } else if (number / 1000 != 0) {
            return number;
        } else if (number / 100 != 0) {
            return number * 10;
        } else if (number / 10 != 0) {
            return number * 100;
        } else {
            return number * 1000;
        }
    }
}