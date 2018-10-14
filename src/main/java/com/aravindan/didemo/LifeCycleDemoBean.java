package com.aravindan.didemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## Setting Application Context");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## Setting Bean Factory");

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## Setting Bean Name");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## Calling destroy method");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## Calling after properties set method");

	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## calling @postConstruct annotated method");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## calling @preDestroy annotated method");
	}
	
	public void beforeInit() {
		System.out.println("## calling Before init - from bean post processor");
	}
	
	public void afterInit() {
		System.out.println("## calling After init - from bean post processor");
	}

}
