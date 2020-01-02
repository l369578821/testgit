package com.kgc.hello;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestEntity {
    private String specialCharacter1; // 特殊字符值1
    private String specialCharacter2; // 特殊字符值2
    private User innerBean; // JavaBean类型
    private List<String> list; // List类型
    private String[] array; // 数组类型
    private Set<String> set; // Set类型
    private Map<String, String> map; // Map类型
    private Properties props; // Properties类型
    private String emptyValue; // 注入空字符串值
    private String nullValue = "init value"; // 注入null值

    public void setSpecialCharacter1(String specialCharacter1) {
        this.specialCharacter1 = specialCharacter1;
    }

    public void setSpecialCharacter2(String specialCharacter2) {
        this.specialCharacter2 = specialCharacter2;
    }

    public void setInnerBean(User user) {
        this.innerBean = user;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }
}