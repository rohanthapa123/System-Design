package org.example.lld.chainofresponsibility.logger;

public class DebugHandler extends LogHandler{
    public DebugHandler(LogHandler nextLogHandler) {
        super(nextLogHandler);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("DEBUG : "  + message);
        }else {

            super.log(logLevel, message);
        }
    }
}
