package tk.hildebrandt.ddd.modulith.selfservice.accounts.persistence;

import java.util.UUID;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import tk.hildebrandt.ddd.modulith.selfservice.accounts.AccountId;

import static tk.hildebrandt.ddd.modulith.selfservice.accounts.AccountId.accountId;

@Converter
class AccountIdConverter implements AttributeConverter<AccountId, UUID> {
   @Override
   public UUID convertToDatabaseColumn(final AccountId attribute) {
      return attribute == null ? null : attribute.getId();
   }

   @Override
   public AccountId convertToEntityAttribute(final UUID dbData) {
      return dbData == null ? null : accountId(dbData);
   }
}
