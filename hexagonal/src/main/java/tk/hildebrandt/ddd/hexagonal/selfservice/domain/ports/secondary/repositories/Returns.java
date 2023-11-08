package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories;

import org.jmolecules.architecture.hexagonal.SecondaryPort;
import org.jmolecules.ddd.annotation.Repository;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.Return;

@Repository
@SecondaryPort
public interface Returns {
   Return persist(Return aReturn);
}
