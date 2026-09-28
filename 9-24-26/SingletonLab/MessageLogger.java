package SingletonLab;

import java.io.*;
import java.util.Scanner;

class MessageLogger {
    private static MessageLogger messageLogger = null;
    private static PrintWriter pw = null;

    private MessageLogger(){
        try{
            pw = new PrintWriter(new FileOutputStream(  new File("9-24-26/SingletonLab/msgs.txt"),   true /* append = true */));
        } catch (FileNotFoundException _) {
            System.out.println("File wasn't found!");
        }

    }

    public static MessageLogger getInstance(){
        if(messageLogger == null)
            messageLogger = new MessageLogger();
        return messageLogger;
    }

    public void logMessage(String message){
        //logs a given message (a string) into a file
        pw.println(message);
        pw.flush();
    }

    public void printAll() {
        //causes all the messages that have thus far been logged to be printed on the console.
        Scanner fileScanner = null;
        try{ fileScanner = new Scanner(new File("9-24-26/SingletonLab/msgs.txt")); } catch ( FileNotFoundException e) {
            System.out.println("File wasn't found!");
        }
        while(fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
    }
}