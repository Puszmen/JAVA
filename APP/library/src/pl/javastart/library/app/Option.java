package pl.javastart.library.app;

public enum Option {

    EXIT(0, "wyjście z programu"),
    ADD_BOOKS(1, "dodaj książkę"),
    ADD_MAGAZINES(2, "dodaj magazyn"),
    PRINT_BOOKS(3, "wyświetl dostępne książki"),
    PRINT_MAGAZINES(4, "wyświetl dostępne magazyny");

    private final int value;
    private final String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    static Option createFromInt (int option) {
        return Option.values()[option];
    }
}
