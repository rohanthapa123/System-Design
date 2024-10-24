package org.example.lld.chainofresponsibility.logger;

public abstract class LogHandler {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogHandler nextLogHandler;

    public LogHandler(LogHandler nextLogHandler){
        this.nextLogHandler = nextLogHandler;
    }

    public void log(int logLevel , String message){
        if(nextLogHandler != null){
            nextLogHandler.log(logLevel, message);
        }
    }

}
