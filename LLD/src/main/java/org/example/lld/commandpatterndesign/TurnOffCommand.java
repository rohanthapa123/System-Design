package org.example.lld.commandpatterndesign;

public class TurnOffCommand implements Command{

    Tv tv;

    public TurnOffCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }

    @Override
    public void redo() {
        execute();
    }
}
