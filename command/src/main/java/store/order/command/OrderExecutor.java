package store.order.command;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderExecutor {
    private List<Command> commands;

    public void execute() {
        commands.forEach(Command::execute);
    }
}
