package org.example.lld.commandpatterndesign;

public class Main {
    public static void main(String[] args) {

        Tv tv = new Tv();

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(new TurnOnCommand(tv));

        remoteControl.pressButton();

        remoteControl.redo();

        remoteControl.undo();


    }
}
