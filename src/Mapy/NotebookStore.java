package Mapy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class NotebookStore {
    public static void main(String[] args) {
        HashMap<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

        String key = "G2A33EA";
        Notebook notebook = notebooks.get(key);
        System.out.println(notebook);

        notebooks.remove("B590");

        System.out.println(notebooks);

        Set<String> keys = notebooks.keySet();

        System.out.println(keys);

        Collection<Notebook> values = notebooks.values();

        for (String s : keys) {
            System.out.println(key + " : " + notebooks.get(key));
        }

        //to samo mozna uzyskac przez entrySet
        Set<Map.Entry<String, Notebook>> entries = notebooks.entrySet();
        //przegladanie takiej kolekcj:
        for (Map.Entry<String, Notebook> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());  // jest to bardziej wydajne niż
            // collection values
        }
    }
}
