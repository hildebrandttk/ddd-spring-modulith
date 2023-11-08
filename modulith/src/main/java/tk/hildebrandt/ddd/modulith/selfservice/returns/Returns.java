package tk.hildebrandt.ddd.modulith.selfservice.returns;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import org.springframework.data.jpa.repository.JpaRepository;

@SecondaryAdapter
interface Returns extends JpaRepository<Return, ReturnId> {
}
