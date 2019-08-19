package io.TheDoctorOne.PostProcessors;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessor implements BeanPostProcessor {
    //Method names are pretty self explanatory.
    @Override
    public java.lang.Object postProcessBeforeInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
        if(bean instanceof Parent) {
            System.out.println("Parent Object");
        } else if (bean instanceof Child) {
            System.out.println("Child Object");
        } else {
            System.out.println("[PPBI]Unknown Object : " + bean.toString());
        }
        return bean;
    }
    @Override
    public java.lang.Object postProcessAfterInitialization(java.lang.Object bean, java.lang.String beanName) throws org.springframework.beans.BeansException {
        if(bean instanceof Parent) {
            
        } else if (bean instanceof Child) {

        } else {
            System.out.println("[PPBI]Unknown Object : " + bean.toString());
        }
        return bean;
    }
}