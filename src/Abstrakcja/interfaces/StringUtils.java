package Abstrakcja.interfaces;

public interface StringUtils {

    static String reverseString(String source) {
        return new StringBuilder(source).reverse().toString();
    }
}
