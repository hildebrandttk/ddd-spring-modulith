package tk.hildebrandt.ddd.modulith.selfservice.returns;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import tk.hildebrandt.ddd.modulith.selfservice.accounts.AccountId;
import tk.hildebrandt.ddd.modulith.selfservice.orders.OrderId;

@Getter
public class ReturnCreatedEvent extends ApplicationEvent {
    private final OrderId orderId;
    private final AccountId accountId;
    private final ReturnId returnId;

    public ReturnCreatedEvent(ReturnOrderUseCase source, OrderId orderId, AccountId accountId, ReturnId returnId) {
        super(source);
        this.orderId = orderId;
        this.accountId = accountId;
        this.returnId = returnId;
    }
}
