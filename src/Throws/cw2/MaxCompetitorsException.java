package Throws.cw2;

public class MaxCompetitorsException extends RuntimeException {
    private final int MaxCompetitors;

    public MaxCompetitorsException(int maxCompetitors) {
        MaxCompetitors = maxCompetitors;
    }

    public int getMaxCompetitors() {
        return MaxCompetitors;
    }
}
