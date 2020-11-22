package com.techsharezone.bootifyjpajwt.service;

/*
 * @created 22/11/2020 -01:17
 * @project bootifyjpajwt
 * @author  saurabhshcs
 */

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ApplicationUserDetailService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("foo", "{noop}foo", new ArrayList<>());
    }
}
