package com.example.msaauthorizationserver.auth;

import com.example.msaauthorizationserver.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByEmail(String email);

}
