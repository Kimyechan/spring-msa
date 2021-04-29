package com.example.msaauthorizationserver.auth;

import com.example.msaauthorizationserver.domain.Account;
import com.example.msaauthorizationserver.domain.Role;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;

@Component
public class DataInitializer implements ApplicationRunner {

    @Resource(name="UserDao")
    private AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Account newAccount = new Account();
        PasswordEncoder passwordEncoder;
        passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        newAccount.setEmail("taes");
        newAccount.setPassword(passwordEncoder.encode("luke"));
        newAccount.setRoles(Set.of(Role.STUDENT));
        accountRepository.save(newAccount);
    }
}
