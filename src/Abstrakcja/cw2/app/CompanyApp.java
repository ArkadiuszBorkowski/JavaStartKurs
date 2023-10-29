package Abstrakcja.cw2.app;

import Abstrakcja.cw2.io.ConsolePrinter;
import Abstrakcja.cw2.io.DataReader;

import java.util.Locale;

public class CompanyApp {

    public static void main(String[] args) {
        CompanyControl companyControl = new CompanyControl();
        DataReader dataReader = new DataReader();

        dataReader.setLanguage();

        companyControl.RunApp();
    }

}
