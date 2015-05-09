package com.springapp.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.Date;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
public class GiftMail {

    private ApplicationContext ctx;
    private JavaMailSender sender;
    private SimpleMailMessage mail;

    // 初始化
    public GiftMail() {

        this.ctx = new ClassPathXmlApplicationContext("application-mail.xml");
        //获取JavaMailSender bean
        this.sender = (JavaMailSender) ctx.getBean("mailSender");
        this.mail = new SimpleMailMessage();
    }

    public void setTo(String to) {
        this.mail.setTo(to);
    }

    public void setFrom(String from) {
        this.mail.setFrom(from);
    }

    public void setSubject(String subject) {
        this.mail.setSubject(subject);
    }

    public void setText(String text) {
        this.mail.setText(text);
    }

    public void setSendDate(Date date) {
        this.mail.setSentDate(date);
    }

    public void send() {
        this.sender.send(this.mail);
    }
}
