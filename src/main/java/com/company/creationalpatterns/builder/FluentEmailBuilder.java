package com.company.creationalpatterns.builder;


public class FluentEmailBuilder implements EmailFrom, EmailTo, EmailSubject, EmailContent, EmailCreator {
    String to;
    String from;
    String subject;
    String content;
    String cc;
    String bcc;

    private FluentEmailBuilder() {

    }

    public static EmailFrom getInstance() {
        return new FluentEmailBuilder();
    }

    public EmailTo setFrom(String from) {
        this.from = from;
        return this;
    }

    public EmailSubject setTo(String to) {
        this.to = to;
        return this;
    }

    public EmailContent setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailCreator setContent(String content) {
        this.content = content;
        return this;
    }

    public EmailCreator setBCC(String bcc) {
        this.bcc = bcc;
        return this;
    }

    public EmailCreator setCC(String cc) {
        this.cc = cc;
        return this;
    }

    public Email build() {
        Email email = new Email();
        email.setFrom(from);
        email.setTo(to);
        email.setContent(content);
        email.setSubject(subject);
        email.setBcc(bcc);
        email.setCc(cc);
        return email;
    }
}
