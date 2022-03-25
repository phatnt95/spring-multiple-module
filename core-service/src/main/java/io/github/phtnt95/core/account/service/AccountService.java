package io.github.phtnt95.core.account.service;

import io.github.phtnt95.core.account.model.Account;
import io.github.phtnt95.core.account.model.AccountFilter;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    List<Account> findAll();
    Optional<Account> findById(Long id);
    List<Account> findByFilter(AccountFilter accountFilter);
    Iterable<Account> save(List<Account> accounts);
}
