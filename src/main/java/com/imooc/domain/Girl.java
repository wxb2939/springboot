package com.imooc.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by xuebing on 2017/8/22.
 */
@Entity
public class Girl {

    @Id
    @GeneratedValue
    private Integer Id;

    private String cupSize;

    @Min(value = 18,message = "18周岁禁止入内")
    private Integer age;

    @NotNull(message = "金额必传")
    private Double money;

    public Girl() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "Id=" + Id +
                ", cupSize='" + cupSize + '\'' +
                ", age=" + age +
                ", money='" + money + '\'' +
                '}';
    }
}
