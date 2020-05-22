package com.Kotori.test;

import com.Kotori.domain.Car;
import com.Kotori.domain.Dog;
import com.Kotori.domain.Person;
import com.Kotori.domain.Shoe;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionTest {
    /***
     * Set方法创建
     */
    @Test
    public void setterInjection() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:InjectionTest.xml");
        Person person = (Person) applicationContext.getBean("personBean");
        System.out.println(person);
    }

    /***
     * 构造器方法创建
     */
    @Test
    public void constructorInjection() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:InjectionTest.xml");
        Car car = (Car) applicationContext.getBean("carBean");
        System.out.println(car);
    }

    /***
     * 静态工厂方法创建
     */
    @Test
    public void staticFactoryInjection() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:InjectionTest.xml");
        Dog dog = (Dog) applicationContext.getBean("dogBean");
        System.out.println(dog);
    }

    /***
     * 实例工厂方法创建
     */
    @Test
    public void factoryInjection() {
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:InjectionTest.xml");
        Shoe shoe1 = (Shoe) applicationContext.getBean("shoeFactoryBean");
        System.out.println(shoe1);

        Shoe shoe2 = (Shoe) applicationContext.getBean("shoeFactoryBean");
        System.out.println(shoe2);
    }

}
