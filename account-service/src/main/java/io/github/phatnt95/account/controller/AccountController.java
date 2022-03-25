package io.github.phatnt95.account.controller;

import io.github.phtnt95.core.account.model.Account;
import io.github.phtnt95.core.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/get/{id}")
    public ResponseEntity<List<Account>> get(@RequestParam Long id) {
        return ResponseEntity.ok(accountService.findAll());
    }
}
