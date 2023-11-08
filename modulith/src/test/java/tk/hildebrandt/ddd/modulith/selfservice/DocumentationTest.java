package tk.hildebrandt.ddd.modulith.selfservice;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

public class DocumentationTest {

    private ApplicationModules modules = ApplicationModules.of(ModulithDemoApplication.class);

    @Test
    void writeDocumentationSnippets() {

        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml()
                .writeModuleCanvases();
    }
}
