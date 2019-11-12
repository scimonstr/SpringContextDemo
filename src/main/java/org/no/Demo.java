package org.no;

import org.no.beans.Application;
import org.no.config.AppConfig;
import org.no.beans.ApplicationContextProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(AppConfig.class);

		ApplicationContextProvider.getApplicationContext().getBean(Application.class).run();
	}
}

