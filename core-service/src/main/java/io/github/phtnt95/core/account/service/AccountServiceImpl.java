package io.github.phtnt95.core.account.service;

import io.github.phtnt95.core.account.model.Account;
import io.github.phtnt95.core.account.model.AccountFilter;
import io.github.phtnt95.core.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> findByFilter(AccountFilter accountFilter) {
        return accountRepository.findAll();
    }

    @Override
    public Iterable<Account> save(List<Account> accounts) {
        return accountRepository.saveAll(accounts);
    }
}
