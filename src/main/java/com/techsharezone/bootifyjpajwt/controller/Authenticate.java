package com.techsharezone.bootifyjpajwt.controller;

/*
 * @created 22/11/2020 -03:25
 * @project bootifyjpajwt
 * @author  saurabhshcs
 */


import com.techsharezone.bootifyjpajwt.model.AuthenticationRequest;
import com.techsharezone.bootifyjpajwt.model.AuthenticationResponse;
import com.techsharezone.bootifyjpajwt.service.ApplicationUserDetailService;
import com.techsharezone.bootifyjpajwt.util.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class Authenticate {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private ApplicationUserDetailService applicationUserDetailService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createTokem(@RequestBody AuthenticationRequest request) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        final UserDetails userDetails = applicationUserDetailService.loadUserByUsername(request.getUsername());
        final String token = jwtService.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(token));
    }
}
