package com.teknei.sitm.gsab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teknei.sitm.gsab.form.LoginForm;

public class Main {

	public static void main(String args[]) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		LoginForm formBean = applicationContext.getBean(LoginForm.class);
		formBean.getFrame().setVisible(true);

	}
}
 