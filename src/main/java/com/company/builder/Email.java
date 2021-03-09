package com.company.builder;

public class Email {
    private String to;
    private String from;
    private String subject;
    private String content;
    private String cc;
    private String bcc;


    public Email() {

    }

    public Email(String to, String from, String subject, String content) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.content = content;
    }
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to='" + to + '\'' +
                ", from='" + from + '\'' +
                ", subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
    public static EmailBuilder emailBuilder() {
        return new EmailBuilder();
    }

    public static class EmailBuilder {
        private String to;
        private String from;
        private String subject;
        private String content;

        public EmailBuilder setTo(String to) {
            this.to = to;
            return this;
        }

        public EmailBuilder setFrom(String from) {
            this.from = from;
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder setContent(String content) {
            this.content = content;
            return this;
        }
        public Email build() {
            return new Email(to,from,subject,content);
        }
    }
}
