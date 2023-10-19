package Object.cw1;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("ASUS", 12345));
        dataStore.add(new Computer("ASUS", 12345));
        dataStore.add(new Computer("APPLE", 6));
        dataStore.add(new Computer("APPLE", 6));
        dataStore.add(new Computer("HP", 8871927));

        Computer compToFind = new Computer("APPLE", 6);

        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);

        for (Computer computer : dataStore.getComputers()) {
            System.out.println(computer);
        }

    }
}
