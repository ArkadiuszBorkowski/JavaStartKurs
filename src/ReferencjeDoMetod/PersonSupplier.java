package ReferencjeDoMetod;

@FunctionalInterface
interface PersonSupplier {
    // String[] fn, String[] ln, int[] a -> Person //
    Person get(String[] fn, String[] ln, int[] a);
}
