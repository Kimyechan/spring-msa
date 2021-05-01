package com.example.msaauthorizationserver;

import com.example.msaauthorizationserver.domain.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo {
    private String id;
    private String password;
    private Set<Role> roles;
}
