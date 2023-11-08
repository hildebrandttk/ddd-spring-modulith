package tk.hildebrandt.ddd.modulith.selfservice.shipments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.modulith.test.ApplicationModuleTest;
import org.springframework.transaction.support.TransactionTemplate;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;
import static tk.hildebrandt.ddd.modulith.selfservice.shipments.ShipmentId.shipmentId;

@ApplicationModuleTest(ApplicationModuleTest.BootstrapMode.STANDALONE)
//@SpringBootTest
class ShipmentFinishedUseCaseApplicationModuleTest {

    public static final ShipmentId SHIPMENT_ID = shipmentId();
    @Autowired
    private ShipmentFinishedUseCase useCase;
    @Autowired
    private JpaShipmentRepository jpaShipmentRepository;
    @Autowired
    private TransactionTemplate transactionTemplate;

    @BeforeEach
    void prepareDatabase() {
        jpaShipmentRepository.persist(Shipment.builder().id(SHIPMENT_ID).build());
    }

    @Test
    void testWithoutDependencies() {
        Instant testStart = Instant.now();

        transactionTemplate.execute(status -> {
            useCase.shipmentFinished(SHIPMENT_ID, Instant.now(), ShipmentResult.SUCCESS);
            return null;
        });

        Shipment loaded = jpaShipmentRepository.loadShipment(SHIPMENT_ID);
        assertThat(loaded.getDeliveryDate()).isBetween(testStart, Instant.now());
        assertThat(loaded.getResult()).isEqualTo(ShipmentResult.SUCCESS);
    }
}