package org.example.lld.chainofresponsibility.logger;

public class InfoHandler extends LogHandler{
    public InfoHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == INFO){
            System.out.println("INFO : "  +message);
        }else
            super.log(logLevel, message);
    }
}
