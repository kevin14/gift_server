package com.springapp.common;

/**
 * Created by zhuoyangzong on 15/5/9.
 */
public class MailTest {

    public static void  main(String args[]){

        GiftMail mail = new GiftMail();
        mail.setTo("zongzhuoyang@hotmail.com");//接受者
        mail.setFrom("371081215@qq.com");//发送者,这里还可以另起Email别名，不用和xml里的username一致
        mail.setSubject("spring mail test!");//主题
        mail.setText("springMail的简单发送测试");//邮件内容
        mail.send();
    }
}
