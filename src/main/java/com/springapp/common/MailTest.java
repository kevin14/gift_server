package com.springapp.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
public class MailTest {

    public static void  main(String args[]){

//        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();
//        // 设定mail server
//        senderImpl.setHost("smtp.qq.com");
//
//        // 建立邮件消息
//        SimpleMailMessage mailMessage = new SimpleMailMessage();
//        // 设置收件人，寄件人 用数组发送多个邮件
//        // String[] array = new String[]    {"sun111@163.com","sun222@sohu.com"};
//        // mailMessage.setTo(array);
//        mailMessage.setTo("zongzhuoyang@hotmail.com");
//        mailMessage.setFrom("371081215@qq.com");
//        mailMessage.setSubject("Mail test");
//        mailMessage.setText("Mail test text");
//
//        senderImpl.setUsername("371081215@qq.com");  //  根据自己的情况,设置username
//        senderImpl.setPassword("zzyzsd1qaz3edc");  //  根据自己的情况, 设置password
//
//        Properties prop = new Properties();
//        prop.put("mail.smtp.auth" , "true");  //  将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
//        prop.put("mail.smtp.timeout" , "25000");
//        prop.put("mail.smtp.port", "25");
//        senderImpl.setJavaMailProperties(prop);
//        // 发送邮件
//        senderImpl.send(mailMessage);
//
//        System.out.println("邮件发送成功..");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-mail.xml");
        //获取JavaMailSender bean
        JavaMailSender sender = (JavaMailSender) ctx.getBean("mailSender");
        SimpleMailMessage mail = new SimpleMailMessage();

        try {
            mail.setTo("zongzhuoyang@hotmail.com");//接受者
            mail.setFrom("371081215@qq.com");//发送者,这里还可以另起Email别名，不用和xml里的username一致
            mail.setSubject("spring mail test!");//主题
            mail.setText("springMail的简单发送测试");//邮件内容
            sender.send(mail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
