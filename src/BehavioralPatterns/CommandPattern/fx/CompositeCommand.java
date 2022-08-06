package BehavioralPatterns.CommandPattern.fx;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements ICommand {
    private List<ICommand> _commands;

    public CompositeCommand() {
        _commands = new ArrayList<>();
    }

    public void addCommand(ICommand command) {
        this._commands.add(command);
    }

    @Override
    public void execute() {
        for (ICommand command : _commands) {
            command.execute();
        }
    }
}
