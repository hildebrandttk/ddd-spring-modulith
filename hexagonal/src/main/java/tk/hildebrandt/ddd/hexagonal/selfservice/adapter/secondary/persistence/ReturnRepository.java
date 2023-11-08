package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.secondary.persistence;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.returns.Return;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Returns;

@SecondaryAdapter
class ReturnRepository implements Returns {
   @Override
   public Return persist(Return aReturn) {
      return aReturn;
   }
}
