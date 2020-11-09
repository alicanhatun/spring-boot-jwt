package com.alican.jwt.config;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private Map<String, String> users = new HashMap<>();

    @PostConstruct
    public void init() {
        users.put("alicanhatun", "$2a$10$b1QT1fMJK9FgF76CCQeQ0OQFQ2va.C84/0h6y4iHD9sESuO4xcUFq");
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User(username, users.get(username), new ArrayList<>());
    }
}
