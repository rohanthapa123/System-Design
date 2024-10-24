package org.example.lld.chainofresponsibility.logger;

public class ErrorHandler extends LogHandler{
    public ErrorHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == ERROR){
            System.out.println("ERROR : "  +message);
        }else {
            super.log(logLevel, message);
        }

    }
}
