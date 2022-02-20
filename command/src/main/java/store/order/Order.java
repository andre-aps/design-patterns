package store.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import store.budget.Budget;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Order {
    private String clientName;
    private LocalDateTime date;
    private Budget budget;

    public void sendEmail() {
        System.out.println("Sending order e-mail");
    }

    public void saveInDatabase() {
        System.out.println("Saving order in database");
    }
}
