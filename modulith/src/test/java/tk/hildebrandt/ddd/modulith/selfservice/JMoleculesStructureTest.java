package tk.hildebrandt.ddd.modulith.selfservice;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.jmolecules.archunit.JMoleculesArchitectureRules;
import org.jmolecules.archunit.JMoleculesDddRules;
import org.junit.jupiter.api.Test;

public class JMoleculesStructureTest {

    @Test
    public void verifyDomainRules() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages(JMoleculesStructureTest.class.getPackageName());

        ArchRule dddRules = JMoleculesDddRules.all();

        dddRules.check(importedClasses);
    }
    @Test
    public void verifyHexagonalRules() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages(JMoleculesStructureTest.class.getPackageName());

        ArchRule hexagonal = JMoleculesArchitectureRules.ensureHexagonal();

        hexagonal.check(importedClasses);
    }
}
