package SingletonLab;

import java.io.*;

public class Tester{
    public static void main(String[] args) {
        MessageLogger mL = MessageLogger.getInstance();

        mL.logMessage("Hello");
        mL.logMessage("My name is Vihaan");
        mL.printAll();
    }
}