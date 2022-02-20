package store.order.command;

import lombok.AllArgsConstructor;
import store.order.Order;

@AllArgsConstructor
public class SaveOrderInDatabaseCommand implements Command {
    private Order order;

    @Override
    public void execute() {
        order.saveInDatabase();
    }
}
