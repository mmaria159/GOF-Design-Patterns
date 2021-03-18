package com.company.builder;

interface EmailFrom {
    EmailTo setFrom(String from);
}

interface EmailTo {
    EmailSubject setTo(String to);
}

interface EmailSubject {
    EmailContent setSubject(String subject);
}

interface EmailContent {
    EmailCreator setContent(String content);
}

public interface EmailCreator {
    EmailCreator setBCC(String bcc);

    EmailCreator setCC(String cc);

    Email build();
}