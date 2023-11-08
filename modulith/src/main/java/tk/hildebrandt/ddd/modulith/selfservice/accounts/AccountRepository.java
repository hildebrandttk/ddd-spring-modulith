package tk.hildebrandt.ddd.modulith.selfservice.accounts;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;
import org.springframework.data.jpa.repository.JpaRepository;

@SecondaryAdapter
interface AccountRepository extends JpaRepository<Account, AccountId> {
}
