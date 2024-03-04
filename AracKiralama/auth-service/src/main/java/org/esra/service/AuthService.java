package org.esra.service;

import org.esra.entity.Auth;
import org.esra.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService extends ServiceManager<Auth, Long> {


    public AuthService(JpaRepository<Auth, Long> repository) {
        super(repository);
    }
}
