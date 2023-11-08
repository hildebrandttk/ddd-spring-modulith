package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
import tk.hildebrandt.ddd.modulith.selfservice.returns.ReturnCreatedEvent;

@Service
public class CreateReturnShipmentUseCase {

    @ApplicationModuleListener
    void on(ReturnCreatedEvent returnCreatedEvent) {
        System.out.println("ReturnCreatedEvent" + returnCreatedEvent.getReturnId());
    }
}
