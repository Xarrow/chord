package service.impl;

import org.springframework.core.annotation.Order;

import java.lang.annotation.Annotation;

/**
 * @Author zhang
 * @Time 2016/9/23.
 */
public class TestBean implements Order {
    @Override
    public int value() {
        return 0;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
