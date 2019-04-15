package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author 段杨宇
 * @create 2019-01-17 14:10
 **/
/**
 * 将 application.properties 配置文件中 config 前缀的映射到指定的属性上
 */
@ConfigurationProperties(prefix = "config")
public class Config {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Config{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
