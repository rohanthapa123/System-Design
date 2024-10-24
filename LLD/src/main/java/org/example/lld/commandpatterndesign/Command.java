package org.example.lld.commandpatterndesign;

public interface Command {
    void execute();
    void undo();
    void redo();
}
