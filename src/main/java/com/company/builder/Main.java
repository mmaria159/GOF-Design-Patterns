package com.company.builder;

public class Main {
    public static void main(String[] args) {
       Email email = Email.emailBuilder()
               .setTo("exemplu2@gmail.com")
               .setFrom("exemplu@gmail.com")
               .setContent("Hello! I implemented builder pattern")
               .setSubject("Testing sending an email")
               .build();
        MailService mailService = new MailService();
        mailService.sendEmail(email);
     //  System.out.println(email.toString());

        Email email2 = FluentEmailBuilder.getInstance()
                .setFrom("exemplu@gmail.com")
                .setTo("exemplu2@gmail.com")
                .setSubject("Testing sending an email")
                .setContent("Hello! I implemented fluent builder pattern")
                .setCC("exemplu3@gmail.com")
                .build();
        mailService.sendEmail(email2);

    }
}