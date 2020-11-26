package com.techsharezone.bootifyjpajwt.controller;

/*
 * @created 22/11/2020 -03:25
 * @project bootifyjpajwt
 * @author  saurabhshcs
 */


import com.techsharezone.bootifyjpajwt.model.AuthenticationRequest;
import com.techsharezone.bootifyjpajwt.model.AuthenticationResponse;
import com.techsharezone.bootifyjpajwt.service.BootifyEmailService;
import com.techsharezone.bootifyjpajwt.service.BootifyUserDetailService;
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
    private BootifyUserDetailService bootifyUserDetailService;

    @Autowired
    private BootifyEmailService emailService;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createTokem(@RequestBody AuthenticationRequest request) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

        final UserDetails userDetails = bootifyUserDetailService.loadUserByUsername(request.getUsername());
        final String token = jwtService.generateToken(userDetails);

        emailService.sendEmailWithJWTToken("saurabhshcs@gmail.com", "API-Authentication:Token",
                "Hello Developer, Please see an JWT Token to access our API- [" + token + "]");

        return ResponseEntity.ok(new AuthenticationResponse(token));
    }
}
