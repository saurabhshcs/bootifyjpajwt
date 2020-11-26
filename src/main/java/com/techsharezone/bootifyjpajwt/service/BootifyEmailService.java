package com.techsharezone.bootifyjpajwt.service;

/*
 * @created 26/11/2020 -02:44
 * @project bootifyjpajwt
 * @author  saurabhshcs
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class BootifyEmailService {

    private static final Logger LOG = LoggerFactory.getLogger(BootifyEmailService.class);

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmailWithJWTToken(final String to, final String subject, final String message) {

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        simpleMailMessage.setFrom("Spring-Security-Bootify-App@techsharezone.com");

        mailSender.send(simpleMailMessage);

        LOG.info("The email has been sent to [{}]", to);
    }

}
