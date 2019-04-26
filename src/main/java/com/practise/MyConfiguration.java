package com.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practise.MyBean;

@Configuration
public class MyConfiguration {

    @Bean
    public MyBean myBean() {
		return new MyBean();
	}
    
    @Bean
    public MyBeanConsumer myBeanConsumer() {
		return new MyBeanConsumer(myBean());
	}
	
}