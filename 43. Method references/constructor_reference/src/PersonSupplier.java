@FunctionalInterface
public interface PersonSupplier {
    Person get(String[] fn, String[] ln, int[] a);
}