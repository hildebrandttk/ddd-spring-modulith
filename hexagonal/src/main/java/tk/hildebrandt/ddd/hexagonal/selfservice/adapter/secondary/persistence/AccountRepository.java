package tk.hildebrandt.ddd.hexagonal.selfservice.adapter.secondary.persistence;

import org.jmolecules.architecture.hexagonal.SecondaryAdapter;

import tk.hildebrandt.ddd.hexagonal.selfservice.domain.ports.secondary.repositories.Accounts;

@SecondaryAdapter
class AccountRepository implements Accounts {
}
