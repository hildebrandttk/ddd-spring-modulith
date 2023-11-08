package tk.hildebrandt.ddd.modulith.selfservice;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

class SpringModulithStructureTest {

    @Test
    void testStructure() {
        ApplicationModules modules = ApplicationModules.of(ModulithDemoApplication.class);

        modules.forEach(System.out::println);

        modules.verify();
    }
}
