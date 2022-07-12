package com.codedifferently.tankofamerica.domain.user.account.repos;

import com.codedifferently.tankofamerica.domain.user.account.models.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<Account, Long> {
}
