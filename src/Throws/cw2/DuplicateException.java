package Throws.cw2;

public class DuplicateException extends RuntimeException {
    private final Participant participant;

    public DuplicateException(Participant participant) {
        this.participant = participant;
    }

    public Participant getParticipant() {
        return participant;
    }
}
