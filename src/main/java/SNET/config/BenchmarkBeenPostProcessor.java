package SNET.config;

import SNET.annotation.Benchmark;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

@Component
public class BenchmarkBeenPostProcessor implements BeanPostProcessor {

    private Map<String, Class> map = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();
        if (clazz.isAnnotationPresent(Benchmark.class)) {
            map.put(beanName, clazz);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = map.get(beanName);
        if(clazz != null) {
            return Proxy.newProxyInstance(
                    clazz.getClassLoader(),
                    clazz.getInterfaces(),
                    (proxy, method, args) -> {
                        long start = System.nanoTime();
                        Object result = method.invoke(bean, args);
                        long end = System.nanoTime();
                        System.out.println("Testing: " + method.getName() + " time: " + (end - start) + " ns");
                        return result;
                    }
            );
        }
        return bean;
    }
}
