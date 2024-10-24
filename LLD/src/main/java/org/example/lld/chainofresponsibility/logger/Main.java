package org.example.lld.chainofresponsibility.logger;

public class Main {
    public static void main(String[] args) {
        LogHandler handler = new InfoHandler(new DebugHandler(new ErrorHandler(null)));

        handler.log(LogHandler.INFO, "This is a log");
        handler.log(LogHandler.DEBUG, "This is my debugging massage");
        handler.log(LogHandler.ERROR, "This is my error message");
    }
}
