package org.example.lld.commandpatterndesign;

import java.util.Stack;

public class RemoteControl {

    Stack<Command> commandHistory = new Stack<>();
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        if(!commandHistory.isEmpty())
            commandHistory.pop().undo();
    }
    public void redo(){
        if(!commandHistory.isEmpty())
            commandHistory.peek().redo();
    }

}
