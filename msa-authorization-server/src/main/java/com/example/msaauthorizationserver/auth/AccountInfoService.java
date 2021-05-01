package com.example.msaauthorizationserver.auth;

import com.example.msaauthorizationserver.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountInfoService implements UserDetailsService {
    private final AccountRepository accountRepository;


    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        Account account = accountRepository.findById(Long.valueOf(id)).orElseThrow();

        if(account == null) {
            throw new UsernameNotFoundException("wrongId");
        }

        return new AccountInfo(account);
    }
}
