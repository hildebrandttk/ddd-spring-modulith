package tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories;

import org.jmolecules.architecture.hexagonal.SecondaryPort;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.accounts.Account;
import tk.hildebrandt.ddd.hexagonal.selfservice.domain.model.accounts.AccountId;

@SecondaryPort
public interface Accounts extends org.jmolecules.ddd.types.Repository<Account, AccountId> {
}
