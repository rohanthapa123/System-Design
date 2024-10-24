package org.example.lld.commandpatterndesign;

public class TurnOnCommand implements Command
{
    Tv tv;

    public TurnOnCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }

    @Override
    public void redo() {
        execute();
    }
}
