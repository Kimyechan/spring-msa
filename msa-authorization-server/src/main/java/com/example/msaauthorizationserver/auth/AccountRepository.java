package com.example.msaauthorizationserver.auth;

import com.example.msaauthorizationserver.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Long> {
}
