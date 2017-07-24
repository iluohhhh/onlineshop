package com.orange.util;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.Session;



public class MailTest {
	public static void sendMail(String email, String username) throws MessagingException, IOException {
		System.out.println(email+"aasa");
		Session session = MailUtils.createSession("smtp.163.com",
				"lrhtomcat", "lrh2282402253");
		Mail mail = new Mail("lrhtomcat@163.com", email,
				"找回密码或修改密码提醒", "<h1>此邮件为官方邮件！请点击下面链接完成找回密码操作！</h1><h3><a href='http://localhost:8080/orangeShop/getPassword.action?username=" + username + "'>http://localhost:8080/SendMail/servlet/GetPasswordServlet</a></h3>");

		MailUtils.send(session, mail);
		System.out.println("邮件已发送");
	}
}
