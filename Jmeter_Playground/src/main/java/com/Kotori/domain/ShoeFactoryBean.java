package com.Kotori.domain;

import org.springframework.beans.factory.FactoryBean;

public class ShoeFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new Shoe("Nike", 1200);
    }

    @Override
    public Class<?> getObjectType() {
        return Shoe.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
