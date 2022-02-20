package store.order;

import store.budget.Budget;
import store.order.command.OrderExecutor;
import store.order.command.SaveOrderInDatabaseCommand;
import store.order.command.SendEmailOrderCommand;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class OrderClient {
    public static void main(String[] args) {
        var order = new Order("André", LocalDateTime.now(), Budget.of(new BigDecimal(200), 4));
        var sendEmailOrderCommand = new SendEmailOrderCommand(order);
        var saveOrderInDatabaseCommand = new SaveOrderInDatabaseCommand(order);

        new OrderExecutor(List.of(sendEmailOrderCommand, saveOrderInDatabaseCommand)).execute();
    }
}
