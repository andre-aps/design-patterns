package store.order.command;

@FunctionalInterface
public interface Command {
    void execute();
}
