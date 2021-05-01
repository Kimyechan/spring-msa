package com.example.msaauthorizationserver;

import com.example.msaauthorizationserver.auth.AccountRepository;
import com.example.msaauthorizationserver.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountKafkaConsumer {
    private final AccountRepository accountRepository;

    @KafkaListener(topics = "account", groupId = "group_id")
    public void consume(AccountInfo accountInfo) {
        Account account = Account.builder()
                .id(Long.valueOf(accountInfo.getId()))
                .password(accountInfo.getPassword())
                .roles(accountInfo.getRoles())
                .build();

        accountRepository.save(account);
    }
}
