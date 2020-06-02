package com.springdiexample.demo.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLifeCycleDemo implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public BeanLifeCycleDemo() {
        System.out.println("I am Bean Life Cycle demo");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean factory has set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## set bean name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## the life cycle has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## Life cycle has its propery set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## set the application context for the bean");
    }
}
