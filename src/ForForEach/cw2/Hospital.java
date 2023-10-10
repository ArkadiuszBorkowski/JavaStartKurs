package ForForEach.cw2;

public class Hospital {
    private final int maxPatientsNumber = 10;
    private Patient[] patients  = new Patient[maxPatientsNumber];
    private int regPatiens = 0;

    public void addPatient(Patient patient) {
        if (regPatiens < maxPatientsNumber) {
            patients[regPatiens] = patient;
            regPatiens++;
        } else {
            System.out.println("Uzyskano maksymalną liczbę pacjentów");
        }
    }

    public void printPatients() {
        for (int i = 0; i < regPatiens; i++) {
            System.out.println(patients[i]);
        }
    }
}
