package com.techsharezone.bootifyjpajwt.model;

/*
 * @created 22/11/2020 -03:03
 * @project bootifyjpajwt
 * @author  saurabhshcs
 */

public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
