package store.order.command;

import lombok.AllArgsConstructor;
import store.order.Order;

@AllArgsConstructor
public class SendEmailOrderCommand implements Command {
    private Order order;

    @Override
    public void execute() {
        order.sendEmail();
    }
}
