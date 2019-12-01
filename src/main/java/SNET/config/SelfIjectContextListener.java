package SNET.config;

import SNET.annotation.SelfInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class SelfIjectContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ConfigurableListableBeanFactory factory;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {/*
        ApplicationContext context = event.getApplicationContext();
        String[] names = context.getBeanDefinitionNames();
        for(String beanName : names) {
            BeanDefinition beanDefinition = factory.getBeanDefinition(beanName);
            String beanClassName = beanDefinition.getBeanClassName();
            try {
                Class<?> classBean = Class
                        .forName(beanClassName);
                Field[] fields = classBean.getDeclaredFields();
                for(Field field : fields) {
                    if(field.isAnnotationPresent(SelfInjection.class)) {
                        Object bean = factory.getBean(beanName);
                        field.setAccessible(true);
                        field.set(bean, bean);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NullPointerException e) {
                e.printStackTrace();
                System.out.println(beanName);
            }
        }
        System.out.println("All");*/
    }
}
