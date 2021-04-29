package com.example.msaauthorizationserver.auth;

import com.example.msaauthorizationserver.domain.Account;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountInfoService implements UserDetailsService {

    @Resource(name="UserDao")
    private AccountRepository accountRepository;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Account account = accountRepository.findByEmail(email);

        if(account == null) {
            throw new UsernameNotFoundException("wrongId");
        }

        return new AccountInfo(account);
    }
}
