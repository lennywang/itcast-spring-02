package com.itcast.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 *
 **/
@Repository("user")
@Scope("singleton")
public class User {
    private String name;
    @Value("18")
    private Integer age;
    @Resource(name = "car")
    private Car car;

    public String getName() {
        return name;
    }
    @Value("tom")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User() {
        System.out.println("User()");
    }

    public User(String name, Integer age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    @PostConstruct
    public void init()
    {
        System.out.println("我是初始化方法");
    }

    @PreDestroy
    public void destory()
    {
        System.out.println("我是销毁方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", car=" + car +
                '}';
    }
}
