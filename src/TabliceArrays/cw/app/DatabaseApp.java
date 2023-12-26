package TabliceArrays.cw.app;

import TabliceArrays.cw.model.PersonDatabase;

public class DatabaseApp {
    public static void main(String[] args) {
        DatabaseControl databaseControl = new DatabaseControl();
        databaseControl.controlLoop();
    }
}
